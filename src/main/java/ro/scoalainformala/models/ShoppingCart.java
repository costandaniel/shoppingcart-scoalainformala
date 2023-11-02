package ro.scoalainformala.models;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> shoppingcart;

    public ShoppingCart() {
        shoppingcart = new ArrayList<>();
    }

    public void addProduct(CartItem cartItem) {
        shoppingcart.add(cartItem);
    }

    public void removeProduct(CartItem cartItem) {
        shoppingcart.remove(cartItem);
    }

    public void increaseQuantityShopping(CartItem cartItem) {
        cartItem.increaseQuantity();
    }

    public void decreaseQuantityShopping(CartItem cartItem) {
        cartItem.decreaseQuantity();
    }

    public double price() {
        double sum = 0;
        for (CartItem cart : shoppingcart) {
            sum += cart.getPrice();
        }
        return sum;
    }

    public void displayShoppingCart() {
        for (CartItem c : shoppingcart) {
            System.out.println(c);
        }
    }
}
