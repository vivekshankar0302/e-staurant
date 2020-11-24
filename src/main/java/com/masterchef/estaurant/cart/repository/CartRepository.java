package com.masterchef.estaurant.cart.repository;

import com.masterchef.estaurant.cart.model.Cart;
import com.masterchef.estaurant.menu.model.Item;
import com.masterchef.estaurant.menu.model.ItemType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends CrudRepository<Cart, String> {
    List<Cart> findByUserId(String userId);
}
