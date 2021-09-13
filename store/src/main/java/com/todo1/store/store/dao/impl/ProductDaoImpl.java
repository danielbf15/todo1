package com.todo1.store.store.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.todo1.store.store.dao.ProductDao;
import com.todo1.store.store.model.Product;

public class ProductDaoImpl implements ProductDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> getProducts() {
        return entityManager.createQuery("FROM Product").getResultList();
    }

    @Override
    public List<Product> getProducts(boolean isActive) {
        if(isActive) {
            return entityManager.createQuery("FROM Product").getResultList();
        } else {
            return this.getProducts();
        }
    }

    @Override
    public Product getProduct(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product getProduct(String sku) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product saveProduct(Product product) {
        // TODO Auto-generated method stub
        return product;
    }
    
}
