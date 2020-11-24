package com.masterchef.estaurant.menu.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Item {

    @Id
    private String id;
    private String itemName;
    private String itemDescription;
    private ItemType itemType;
    @Embedded
    private Price price;
    private String imageUrl;

    public Item() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
