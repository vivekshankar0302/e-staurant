package com.masterchef.estaurant.cart.model;


import com.masterchef.estaurant.menu.model.Item;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Cart {

    @Id
    private String id;
    private String userId;
    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<CartItem> cartItems;
    @Embedded
    private Discount discount;

    public Cart() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
