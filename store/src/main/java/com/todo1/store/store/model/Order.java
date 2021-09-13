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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created")
    private Calendar created;

    @Column(name = "status")
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserStore userStore;

    @OneToMany(mappedBy = "products_in_orders", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<ProductInOrder> productInOrder;


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
     * @return UserStore return the userStore
     */
    public UserStore getUserStore() {
        return userStore;
    }

    /**
     * @param userStore the userStore to set
     */
    public void setUserStore(UserStore userStore) {
        this.userStore = userStore;
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

}
