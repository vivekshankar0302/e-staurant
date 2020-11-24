package com.masterchef.estaurant.menu.repository;

import com.masterchef.estaurant.menu.model.Item;
import com.masterchef.estaurant.menu.model.ItemType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuRepository extends CrudRepository<Item, String> {
    List<Item> findByItemType(ItemType itemType);
}
