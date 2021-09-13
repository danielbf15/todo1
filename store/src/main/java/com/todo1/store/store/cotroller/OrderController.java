package com.todo1.store.store.cotroller;

import java.util.List;

import com.todo1.store.store.dao.OrderDao;
import com.todo1.store.store.model.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    
    @Autowired
    private OrderDao orderDao;

    @RequestMapping(value = "api/orders/all")
    public List<Order> getProducts() {
        return orderDao.getOrders();
    }
    
}
