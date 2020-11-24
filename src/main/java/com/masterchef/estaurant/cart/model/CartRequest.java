package com.masterchef.estaurant.cart.model;

import java.util.List;

public class CartRequest {

    private String userId;
    private List<CartItemRequest> cartItemRequests;
    private Discount discount;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<CartItemRequest> getCartItemRequests() {
        return cartItemRequests;
    }

    public void setCartItemRequests(List<CartItemRequest> cartItemRequests) {
        this.cartItemRequests = cartItemRequests;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
}
