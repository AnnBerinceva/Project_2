package model;

public abstract class Food implements Discountable {

    protected int amount; //количество продукта в килограммах
    protected double price; //цена за единицу
    protected boolean isVegetarian; //вегетарианский ли продукт

    public double getPrice() { //цена
        return amount * price;
    }

    public  double getDiscountablePrice() { //цена со скидкой
        return getPrice() * ((100 - getDiscount()) / 100.0);
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
}