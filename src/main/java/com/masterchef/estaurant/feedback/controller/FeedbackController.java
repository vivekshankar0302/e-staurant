package com.masterchef.estaurant.feedback.controller;

import com.masterchef.estaurant.feedback.model.Feedback;
import com.masterchef.estaurant.menu.model.Item;
import com.masterchef.estaurant.feedback.service.FeedbackService;
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
 * This class manages all the feedback endpoints
 * @version 1.0
 * @author vivekshankar
 */
@RestController
@RequestMapping(path = "/masterchef/v1/feedback", produces = MediaType.APPLICATION_JSON_VALUE)
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    /**
     * @return the list of the feedback
     */
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Item> getAllFeedback(@RequestParam(name = "orderid", required = false) String orderId,
                                     @RequestParam(name = "rating", required = false) String rating,
                                     @RequestParam(name = "startdate", required = false) String startDate,
                                     @RequestParam(name = "enddate", required = false) String endDate){
        return null;
    }


    /**
     * @param feedback customer feedback
     * @return
     */
    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> addItem(@RequestBody Feedback feedback){
        return null;
    }

    /**
     * @param feedback update customer feedback
     * @return
     */
    @PutMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public void updateItem(@RequestBody Feedback feedback){

    }


    /**
     * @param id the feedback to be deleted
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeItem(@PathVariable String id){

    }

}
