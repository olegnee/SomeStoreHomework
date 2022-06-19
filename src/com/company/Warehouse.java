package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private static Warehouse warehouse;

    Warehouse() {
    }

    private static final Map<String, Integer> WAREHOUSE = new HashMap<>();

    public static void sendProductToWarehouse(Product product) {
        WAREHOUSE.put(product.getName(), product.getAmount());
        System.out.println("Продукт:" + product.getName() + ", добавлен на склад в количестве: " + product.getAmount() + product.getUnitOfMeasure());
    }

    // TODO: 03.06.2022 complete this method 
    public static void showTheWarehouse() {
        if (!WAREHOUSE.isEmpty()) {
            System.out.println("Сейчас на складе имеется:");
            WAREHOUSE.keySet().forEach(System.out::println);
            WAREHOUSE.values().forEach(System.out::println);
            System.out.println();
        } else {
            System.out.println("Склад пуст.");
        }
    }

    public static void menuFilter(String wantedProduct) {
        if (!WAREHOUSE.isEmpty()) {
            if (WAREHOUSE.containsKey(wantedProduct)) {
                System.out.println("Такой товар есть в наличии.");
            } else {
                System.out.println("Извините, но такого товара нет в нашем ассортименте.");
            }
        }
    }

    public static Product sentProductToBasketFromWareHouse(String nameOfProduct, int amount) {
        Product productToBasket = null;
        try {
            if (!WAREHOUSE.isEmpty() && WAREHOUSE.containsKey(nameOfProduct)) {

                int newAmount = WAREHOUSE.get(nameOfProduct) - amount;
                WAREHOUSE.remove(nameOfProduct);
                WAREHOUSE.put(nameOfProduct, newAmount);
                productToBasket = new Product(nameOfProduct, newAmount);

            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return productToBasket;
    }

}
