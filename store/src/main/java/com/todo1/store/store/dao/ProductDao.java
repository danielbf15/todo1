package com.todo1.store.store.dao;

import java.util.List;

import com.todo1.store.store.model.Product;

public interface ProductDao {
    
    public List<Product> getProducts();
    
    public List<Product> getProducts(boolean isActive);

    public Product getProduct(Long id);

    public Product getProduct(String sku);

    public Product saveProduct(Product product);

}
