package com.product;
import java.util.Scanner;

public class ProductManagement {
    Product product = new Product();
    Scanner scanner = new Scanner(System.in);

    public void printDouble(double price){
        System.out.println("The second price is : " + price);
        price = 5;
        System.out.println("The third price is : " + price);
    }

    public void printString(String productName){
        System.out.println("The second product name is : " + productName);
        productName = "Jug";
        System.out.println("The third product name is : " + productName);
    }

    public void updatePrice(double price){
        System.out.print("What is the new price ? ");
        price = scanner.nextDouble();
        System.out.println("The new price is : " + price);
    }

    public  void updateProduct(Product product){
        product.setProductName("Brian");
        product.setPrice(43);
        System.out.println("The modified product is : " + product);
    }

    public  void reassignProduct(Product product){
        product = new Product("Rice", 400);
        System.out.println("The inside price is : " + product);
    }
}
