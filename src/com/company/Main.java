package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ClientBusket basket = new ClientBusket();
        ArrayList<Product> someProducts = new ArrayList<>();
        Product someProduct1 = new Product("Цемент", 365, "т.");
        Product someProduct2 = new Product("Песок", 220,"т.");
        Product someProduct3 = new Product("Мрамор", 345, "т.");
        Warehouse.sendProductToWarehouse(someProduct1);
        Warehouse.sendProductToWarehouse(someProduct2);
        Warehouse.sendProductToWarehouse(someProduct3);
        someProducts.add(someProduct1);
        someProducts.add(someProduct2);
        someProducts.add(someProduct3);
        Warehouse.showTheWarehouse();
        Warehouse.menuFilter("Цемент");
        Warehouse.menuFilter("фигня какая то");
        Warehouse.sentProductToBasketFromWareHouse("Песок" , 100);
        Warehouse.showTheWarehouse();
        Product illBuyIt = new Product("Цемент", 100);
        basket.addProductToBasket(illBuyIt);
        Warehouse.showTheWarehouse();

    }
}
