package com.masterchef.estaurant.menu.service;

import com.masterchef.estaurant.menu.model.Item;
import com.masterchef.estaurant.menu.model.ItemType;
import com.masterchef.estaurant.menu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Item> getAllItems(){
        List<Item> items = new ArrayList<>();
        menuRepository.findAll().forEach(items::add);
        return Collections.unmodifiableList(items);
    }

    public Optional<Item> getItem(String id){
        return menuRepository.findById(id);
    }

    public List<Item> findItemsByItemType(ItemType itemType){
        return menuRepository.findByItemType(itemType);
    }

    public void addItem(Item item){
        menuRepository.save(item);
    }

    public void removeItem(String id){
        menuRepository.deleteById(id);
    }

}
