package com.masterchef.estaurant.inventory.model;

public class InventoryItem {
    private String id;
    private String itemId;
    private String requestedQuantity;
    private int availability;
    private boolean isAvailable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getRequestedQuantity() {
        return requestedQuantity;
    }

    public void setRequestedQuantity(String requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
