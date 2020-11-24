package com.masterchef.estaurant.cart.service;

import com.masterchef.estaurant.cart.model.Cart;
import com.masterchef.estaurant.cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public void createCart(Cart cart){
        cartRepository.save(cart);
    }

    public List<Cart> getAllCarts(){
        List<Cart> carts = new ArrayList<>();
        cartRepository.findAll().forEach(carts::add);
        return Collections.unmodifiableList(carts);
    }

    public List<Cart> getAllCartsByUserId(String userId){
        return cartRepository.findByUserId(userId);
    }

}
