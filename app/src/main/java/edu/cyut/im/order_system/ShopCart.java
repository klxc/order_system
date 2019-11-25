package edu.cyut.im.order_system;

import edu.cyut.im.order_system.Dish;

import java.io.Serializable;
import java.util.ArrayList;


public class ShopCart implements Serializable {
    private ArrayList<Dish> items;

    public ShopCart(ArrayList<Dish> items) {
        this.items = items;
    }

    /**
     * Get the items in the cart.
     * @return Array List of {@link Dish} instances.
     */
    public ArrayList<Dish> getItems() {
        return items;
    }

    public void setItems(ArrayList<Dish> items) {
        this.items = items;
    }
}
