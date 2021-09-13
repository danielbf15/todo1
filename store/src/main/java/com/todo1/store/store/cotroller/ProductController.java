package com.todo1.store.store.cotroller;

import java.util.List;

import com.todo1.store.store.dao.ProductDao;
import com.todo1.store.store.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    @Autowired
    private ProductDao productDao;

    @RequestMapping(value = "api/products/all")
    public List<Product> getProducts() {
        return productDao.getProducts();
    }

    @RequestMapping(value = "api/products/active")
    public List<Product> getActiveProducts() {
        return productDao.getProducts(true);
    }
    
}
