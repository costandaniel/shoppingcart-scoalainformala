package ro.scoalainformala;

import ro.scoalainformala.models.CartItem;
import ro.scoalainformala.models.Product;
import ro.scoalainformala.models.ShoppingCart;


public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product milk = new Product("milk", 10.0);
        Product bread = new Product("bread", 5.3);
        Product cookies = new Product("cookies", 12.5);
        CartItem Mathew = new CartItem(milk, 5);
        CartItem Andrew = new CartItem(bread, 3);
        CartItem Stephen = new CartItem(cookies, 8);
        shoppingCart.addProduct(Mathew);
        shoppingCart.addProduct(Stephen);
        shoppingCart.addProduct((Andrew));
        System.out.println(shoppingCart.price());
        System.out.println(Mathew.getQuantity());
        shoppingCart.decreaseQuantityShopping(Mathew);
        System.out.println(Mathew.getQuantity());
        shoppingCart.displayShoppingCart();
        shoppingCart.removeProduct(Mathew);
        System.out.println(shoppingCart.price());
        shoppingCart.displayShoppingCart();

    }


}