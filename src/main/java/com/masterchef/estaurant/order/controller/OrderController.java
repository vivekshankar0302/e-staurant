package com.masterchef.estaurant.order.controller;

import com.masterchef.estaurant.cart.model.Cart;
import com.masterchef.estaurant.cart.model.CartItem;
import com.masterchef.estaurant.cart.model.CartRequest;
import com.masterchef.estaurant.order.model.Order;
import com.masterchef.estaurant.order.service.OrderService;
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
 * This class manages all the order service endpoints
 * @version 1.0
 * @author vivekshankar
 */
@RestController
@RequestMapping(path = "/masterchef/v1/orders", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * @return the list of the products in the menu
     */
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Order> getAllOrders(@RequestParam(name = "userid", required = false) String userId,
                                   @RequestParam(name = "orderstatus", required = false) String orderStatus ){
        return null;
    }

    /**
     * @param order order to be created using the customer's cart
     * @return
     */
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> createOrder(@RequestBody Order order){
        return null;
    }

    /**
     * @param order order updated by the customer
     * @return
     */
    @PutMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> updateOrder(@RequestBody Order order){
        //TODO: Implementation
        return null;
    }

}
