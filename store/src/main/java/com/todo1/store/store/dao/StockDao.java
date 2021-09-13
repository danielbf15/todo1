package com.todo1.store.store.dao;

import java.util.List;

import com.todo1.store.store.model.Stock;

public interface StockDao {
    
    public List<Stock> getStocks();

    public Stock getStock(Long id);

    public Stock saveStock(Stock stock);

}
