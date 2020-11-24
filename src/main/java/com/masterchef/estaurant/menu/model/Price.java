package com.masterchef.estaurant.menu.model;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class Price {
    private CurrencyType currencyType;
    private BigDecimal cost;

    public Price(){

    }

    public Price(CurrencyType currencyType, BigDecimal cost) {
        this.currencyType = currencyType;
        this.cost = cost;
    }

    public CurrencyType getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyType currencyType) {
        this.currencyType = currencyType;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }
}
