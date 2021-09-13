package com.todo1.store.store.dao;

import java.util.List;

import com.todo1.store.store.model.Order;

public interface OrderDao {
    
    public List<Order> getOrders();

    public Order getOrder(Long id);

    public Order saveOrder(Order order);

}
