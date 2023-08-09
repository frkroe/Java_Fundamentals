package com.frkroe;
import com.frkroe.model.Product;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        // Create two instances of the Product class.
        Product product1 = new Product("Keyboard",16.99f);
        Product product2 = new Product("Mouse",5.99f);
        Product product3 = new Product("Monitor",99.99f);

        // Print the name of the first product and the price of the second product, calling the functions getName() and getPrice().
        System.out.println(product1.getName());
        System.out.println(product2.getPrice());
        System.out.println(product3.getProductID());

        // Print all parameters of the first product as json:
        System.out.println(product1.toJson());

    }
}