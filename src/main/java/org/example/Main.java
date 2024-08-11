package org.example;

import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN_APPLES;
import static model.constants.Colour.RED_APPLES;

public class Main {
    public static void main(String[] args) {
        Food[] foods = {
                new Meat(15, 100),
                new Apple(25, 50, RED_APPLES),
                new Apple(80, 60, GREEN_APPLES),
        };
        ShoppingCart shoppingCart = new ShoppingCart(foods);


        System.out.println(shoppingCart.totalPriceIsVegetarian());
        System.out.println(shoppingCart.totalPriceWithDiscount());
        System.out.println(shoppingCart.totalPrice());
    }
}