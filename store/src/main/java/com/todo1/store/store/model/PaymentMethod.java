package com.todo1.store.store.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payment_methods")
public class PaymentMethod {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "price")
    private Double price;

    @Column(name = "method_type")
    private String method_type;

    @Column(name = "name")
    private String name;

    @Column(name = "card_number")
    private String card_number;

    @Column(name = "cvc")
    private Integer cvc;

    @Column(name = "expiration_month")
    private Integer expiration_month;

    @Column(name = "expiration_year")
    private Integer expiration_year;

    @JoinColumn(name = "payment_id")
    @OneToOne(fetch = FetchType.LAZY)
    private Payment payment;


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
     * @return String return the method_type
     */
    public String getMethod_type() {
        return method_type;
    }

    /**
     * @param method_type the method_type to set
     */
    public void setMethod_type(String method_type) {
        this.method_type = method_type;
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
     * @return String return the card_number
     */
    public String getCard_number() {
        return card_number;
    }

    /**
     * @param card_number the card_number to set
     */
    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    /**
     * @return Integer return the cvc
     */
    public Integer getCvc() {
        return cvc;
    }

    /**
     * @param cvc the cvc to set
     */
    public void setCvc(Integer cvc) {
        this.cvc = cvc;
    }

    /**
     * @return Integer return the expiration_month
     */
    public Integer getExpiration_month() {
        return expiration_month;
    }

    /**
     * @param expiration_month the expiration_month to set
     */
    public void setExpiration_month(Integer expiration_month) {
        this.expiration_month = expiration_month;
    }

    /**
     * @return Integer return the expiration_year
     */
    public Integer getExpiration_year() {
        return expiration_year;
    }

    /**
     * @param expiration_year the expiration_year to set
     */
    public void setExpiration_year(Integer expiration_year) {
        this.expiration_year = expiration_year;
    }

    /**
     * @return Payment return the payment
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

}
