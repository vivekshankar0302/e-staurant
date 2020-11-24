package com.masterchef.estaurant.inventory.controller;

import com.masterchef.estaurant.inventory.model.InventoryItem;
import com.masterchef.estaurant.inventory.service.InventoryService;
import com.masterchef.estaurant.menu.model.Item;
import com.masterchef.estaurant.menu.model.ItemRequest;
import com.masterchef.estaurant.menu.model.ItemType;
import com.masterchef.estaurant.utils.URIUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Objects;

/**
 * This class manages all the inventory service endpoints
 * @version 1.0
 * @author vivekshankar
 */
@RestController
@RequestMapping(path = "/masterchef/v1/inventory", produces = MediaType.APPLICATION_JSON_VALUE)
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    /**
     * @return the list of the items in the inventory
     */
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryItem> getAllItems(){
        return null;
    }

    /**
     * @param id identifier of the inventory item to be retrieved
     * @return the inventory item corresponding to the id
     */
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Item getItem(@PathVariable String id){
        return null;
    }


    /**
     * @param item the item to be updated in the inventory
     * @return
     */
    @PutMapping("/reserve")
    @ResponseStatus(HttpStatus.OK)
    public void reserveItem(@RequestBody Item item){

    }


    /**
     * @param id the item to be deleted in the inventory
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeItem(@PathVariable String id){

    }
}
