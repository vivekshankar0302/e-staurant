package com.masterchef.estaurant.cart.controller;

import com.masterchef.estaurant.cart.model.Cart;
import com.masterchef.estaurant.cart.model.CartItem;
import com.masterchef.estaurant.cart.model.CartRequest;
import com.masterchef.estaurant.cart.service.CartService;
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
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * This class manages all the shopping cart endpoints
 * @version 1.0
 * @author vivekshankar
 */
@RestController
@RequestMapping(path = "/masterchef/v1/carts", produces = MediaType.APPLICATION_JSON_VALUE)
public class CartController {

    @Autowired
    private CartService cartService;

    /**
     * @return the list of the products in the menu
     */
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Cart> getAllItems(@RequestParam(name = "userid", required = false) String userId){
        if(StringUtils.isBlank(userId)){
            return cartService.getAllCarts();
        }
        return cartService.getAllCartsByUserId(userId);
    }

    /**
     * @param cartRequest cart to be created using items added by the consumer
     * @return
     */
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> createCart(@RequestBody CartRequest cartRequest){
        if(Objects.isNull(cartRequest) || CollectionUtils.isEmpty(cartRequest.getCartItemRequests())){
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "INVALID_REQUEST");
        }
        Cart cart = new Cart();
        List<CartItem> cartItems = new ArrayList<>();
        cart.setCartItems(cartItems);
        cartRequest.getCartItemRequests().stream().forEach((cartItem) -> {
            CartItem cItem = new CartItem();
            BeanUtils.copyProperties(cartItem, cItem);
            cItem.setCart(cart);
            cart.getCartItems().add(cItem);
        });
        cart.setDiscount(cartRequest.getDiscount());
        cart.setUserId(cartRequest.getUserId());
        cartService.createCart(cart);
        return ResponseEntity.created(URIUtil.generateUrl(cart.getId())).build();
    }

    /**
     * @param cartRequest cart to be updated using items added by the consumer
     * @return
     */
    @PutMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> updateCart(@RequestBody CartRequest cartRequest){
        //TODO: Implementation
        return null;
    }

    /**
     * @param id the item to be deleted from the cart
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeItem(@PathVariable String id){
        //TODO: Implementation
    }

}
