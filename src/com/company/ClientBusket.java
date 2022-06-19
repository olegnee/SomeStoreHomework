package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ClientBusket {
    private ArrayList <Product> clientBasket;

    public ClientBusket() {
    }

    public void showTheBasketContains() {
        System.out.println(clientBasket.toString());
    }

    public void addProductToBasket (Product product) {
        clientBasket.add(Warehouse.sentProductToBasketFromWareHouse(product.getName(), product.getAmount()));
        System.out.println(product.getName() + " - добавлен в корзину.");
    }
}
