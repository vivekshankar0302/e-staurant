package com.masterchef.estaurant.deliverypartner.controller;

import com.masterchef.estaurant.deliverypartner.model.ExternalOrder;
import com.masterchef.estaurant.deliverypartner.service.DeliveryPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * This class manages all the delivery partner endpoints
 * @version 1.0
 * @author vivekshankar
 */
@RestController
@RequestMapping(path = "/masterchef/v1/externalorders", produces = MediaType.APPLICATION_JSON_VALUE)
public class DeliveryPartnerController {
    @Autowired
    private DeliveryPartnerService deliveryPartnerService;

    /**
     * @return the details of external order
     */
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public ExternalOrder getOrderData(@RequestParam(name = "orderid", required = true) String orderId,
                                      @RequestParam(name = "rating", required = true) String rating){
        return null;
    }

    /**
     * @param externalOrder order received from delivery partner
     * @return
     */
    @PutMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public void updateItem(@RequestBody ExternalOrder externalOrder){

    }

}
