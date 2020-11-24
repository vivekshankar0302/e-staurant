package com.masterchef.estaurant.menu.controller;

import com.masterchef.estaurant.menu.model.Item;
import com.masterchef.estaurant.menu.model.ItemRequest;
import com.masterchef.estaurant.menu.model.ItemType;
import com.masterchef.estaurant.menu.service.MenuService;
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
 * This class manages all the product catalog endpoints
 * @version 1.0
 * @author vivekshankar
 */
@RestController
@RequestMapping(path = "/masterchef/v1/menuitems", produces = MediaType.APPLICATION_JSON_VALUE)
public class MenuController {

    @Autowired
    private MenuService menuService;

    /**
     * @return the list of the products in the menu
     */
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Item> getAllItems(@RequestParam(name = "itemtype", required = false) ItemType itemType){
        if(Objects.isNull(itemType)){
            return menuService.getAllItems();
        }
        return menuService.findItemsByItemType(itemType);
    }

    /**
     * @param id identifier of the menu item to be retrieved
     * @return the menu item corresponding to the id
     */
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Item getItem(@PathVariable String id){
        return menuService.getItem(id).orElseThrow(() ->{
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "MENU_ITEM_NOT_FOUND");
        });
    }

    /**
     * @param itemRequest the item to be added to the restaurant menu
     * @return
     */
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> addItem(@RequestBody ItemRequest itemRequest){
        if(Objects.isNull(itemRequest) || StringUtils.isBlank(itemRequest.getItemName())){
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "INVALID_REQUEST");
        }
        Item item = new Item();
        BeanUtils.copyProperties(itemRequest, item);
        menuService.addItem(item);
        return ResponseEntity.created(URIUtil.generateUrl(item.getId())).build();
    }

    /**
     * @param item the item to be updated in the restaurant menu
     * @return
     */
    @PutMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public void updateItem(@RequestBody Item item){
        menuService.addItem(item);
    }


    /**
     * @param id the item to be deleted in the restaurant menu
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeItem(@PathVariable String id){
        menuService.removeItem(id);
    }
}
