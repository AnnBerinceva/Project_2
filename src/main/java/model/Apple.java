package model;

import static model.constants.Colour.RED_APPLES;
import static model.constants.Discount.DISCOUNTED_RED_APPLES;
import static model.constants.Discount.TOTAL_AMOUNT;

public class Apple extends Food {
    private final String colour;
    public Apple(int amount, double price, String colour) { //конструктор
        super.amount = amount;
        super.price = price;
        super.isVegetarian = true;
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(RED_APPLES)) {
            return DISCOUNTED_RED_APPLES;
        } else {
            return TOTAL_AMOUNT;
        }
    }
}