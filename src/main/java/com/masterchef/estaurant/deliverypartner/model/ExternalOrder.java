package com.masterchef.estaurant.deliverypartner.model;

import java.util.Date;

public class ExternalOrder {
    private String orderId;
    private Partner partner;
    private Date orderDate;
    private OrderType orderType;
    private OrderStatus orderStatus;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
