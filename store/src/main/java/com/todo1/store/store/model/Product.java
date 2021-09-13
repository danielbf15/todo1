package com.todo1.store.store.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created")
    private Calendar created;

    @Column(name = "updated")
    private Calendar updated;

    @Column(name = "sku")
    private String sku;

    @Column(name = "product_type")
    private String product_type;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @Column(name = "status")
    private String status;

    @Column(name = "quantity_available")
    private Integer quantity_available;

    @OneToMany(mappedBy = "products_in_orders", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<ProductInOrder> productInOrder;

    @OneToMany(mappedBy = "products_in_stocks", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<ProductInStock> productInStock;


    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return Calendar return the created
     */
    public Calendar getCreated() {
        return created;
    }

    /**
     * @param created the created to set
     */
    public void setCreated(Calendar created) {
        this.created = created;
    }

    /**
     * @return Calendar return the updated
     */
    public Calendar getUpdated() {
        return updated;
    }

    /**
     * @param updated the updated to set
     */
    public void setUpdated(Calendar updated) {
        this.updated = updated;
    }

    /**
     * @return String return the sku
     */
    public String getSku() {
        return sku;
    }

    /**
     * @param sku the sku to set
     */
    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * @return String return the product_type
     */
    public String getProduct_type() {
        return product_type;
    }

    /**
     * @param product_type the product_type to set
     */
    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Double return the price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return Integer return the quantity_available
     */
    public Integer getQuantity_available() {
        return quantity_available;
    }

    /**
     * @param quantity_available the quantity_available to set
     */
    public void setQuantity_available(Integer quantity_available) {
        this.quantity_available = quantity_available;
    }


    /**
     * @return List<ProductInOrder> return the productInOrder
     */
    public List<ProductInOrder> getProductInOrder() {
        return productInOrder;
    }

    /**
     * @param productInOrder the productInOrder to set
     */
    public void setProductInOrder(List<ProductInOrder> productInOrder) {
        this.productInOrder = productInOrder;
    }

    /**
     * @return List<ProductInStock> return the productInStock
     */
    public List<ProductInStock> getProductInStock() {
        return productInStock;
    }

    /**
     * @param productInStock the productInStock to set
     */
    public void setProductInStock(List<ProductInStock> productInStock) {
        this.productInStock = productInStock;
    }

}
