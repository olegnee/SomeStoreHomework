package Warehouse;

import Product.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
// single - responsibility principle , класс склада выполняет только логически связанный с ним функционал.

public class Warehouse {
    Warehouse() {
    }

    public static final ArrayList<Product> WAREHOUSE = new ArrayList<>();

    public static void sendProductToWarehouse(Product product) {
        WAREHOUSE.add(product);
        System.out.println("Продукт:" + product.getName() + ", добавлен на склад в количестве: " + product.getAmount() + product.getUnitOfMeasure());
    }

    // TODO: 03.06.2022 complete this method 
    public static void showTheWarehouse () {
        if (!WAREHOUSE.isEmpty()) {
            System.out.println("Сейчас на складе имеется:");
            for(Product someProduct : WAREHOUSE) {
                System.out.println(someProduct.getName() + " - в количестве:" + someProduct.getAmount() + someProduct.getUnitOfMeasure());
            }
        }
        else {
            System.out.println("Склад пуст.");
        }
    }

    public static void menuFilter (String wantedProduct) {
        if (!WAREHOUSE.isEmpty()) {
            for (Product someProduct : WAREHOUSE) {
                if (someProduct.getName().equalsIgnoreCase(wantedProduct)) {
                    System.out.println("Такой товар есть в наличии.");
                }
                else {
                    System.out.println("Извините, но такого товара нет в нашем ассортименте.");
                }
            }
        }
    }

    public static Product sentProductToBasketFromWareHouse(String nameOfProduct, int amount) {
        Product toBasket = null;
        if (!WAREHOUSE.isEmpty()) {

            for (Product someProduct : WAREHOUSE) {
                if (someProduct.getName().equalsIgnoreCase(nameOfProduct)) {
                    int newAmount = someProduct.getAmount() - amount;
                    Product newProduct = new Product(someProduct.getName(), newAmount, someProduct.getUnitOfMeasure());
                    toBasket = new Product(someProduct.getName(), amount, someProduct.getUnitOfMeasure());
                    WAREHOUSE.remove(someProduct);

                    WAREHOUSE.add(newProduct);
                }
            }
        }
        return toBasket;
    }

}
