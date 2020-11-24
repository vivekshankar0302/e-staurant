package com.masterchef.estaurant.order.model;

import java.util.Date;

public class Order {
    private String id;
    private String cartId;
    private Customer customer;
    private OrderType orderType;
    private OrderStatus orderStatus;
    private boolean isPartnerOrder;
    private Partner partner;
    private String partnerOrderId;
    private Date orderDate;
    private DeliveryAddress deliveryAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    public boolean isPartnerOrder() {
        return isPartnerOrder;
    }

    public void setPartnerOrder(boolean partnerOrder) {
        isPartnerOrder = partnerOrder;
    }

    public Partner getPartner() {
        return partner;
    }

    public void setPartner(Partner partner) {
        this.partner = partner;
    }

    public String getPartnerOrderId() {
        return partnerOrderId;
    }

    public void setPartnerOrderId(String partnerOrderId) {
        this.partnerOrderId = partnerOrderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public DeliveryAddress getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
