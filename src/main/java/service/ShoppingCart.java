package service;

import model.Food;

public class ShoppingCart {

    private final Food[] items;

    public ShoppingCart(Food[] foods) {
        items = foods;
    }

    public double totalPrice() { //сумма товаров в корзине без скидки
        System.out.println("Сумма вегетарианских товаров без скидки: ");
        double sum = 0;
        for (Food item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public double totalPriceWithDiscount() { //сумма товаров в корзине со скидкой
        System.out.println("Общая сумма товаров со скидкой: ");
        double sum = 0;
        for (Food item : items) {
            sum += item.getDiscountablePrice();
        }
        return sum;
    }

    public double totalPriceIsVegetarian() { //сумма вегетарианских продуктов в корзине без скидки
        System.out.println("Сумма вегетарианских товаров без скидки: ");
        double sum = 0;
        for (Food food : items) {
            if (food.isVegetarian()) {
                sum += food.getPrice();
            }
        }
        return sum;
    }
}