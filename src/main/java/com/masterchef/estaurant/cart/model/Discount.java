package com.masterchef.estaurant.cart.model;

import javax.persistence.Embeddable;

@Embeddable
public class Discount {
    private String promoCode;

    public Discount(String promoCode) {
        this.promoCode = promoCode;
    }

    public Discount() {
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public int getDiscountPercentage(){
        // TODO: Lookup discount code mapping from DB
        if("MASTERCARD".equalsIgnoreCase(this.promoCode)){
            return 5;
        }
        return 0;
    }
}
