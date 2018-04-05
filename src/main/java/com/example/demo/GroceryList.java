package com.example.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {

    public static void main (String[] args){
        Scanner scan = new Scanner((System.in));
        Items i;
        ArrayList<Items> items = new ArrayList<Items>();
        String answer= "";

     /*   int gummyBears = 5;*/
        double tax, saleValue,taxAmount,pricePerItem;
        tax=0.06;

        boolean stop=false;

        do{

            i = new Items();

            System.out.println("Enter in item: ");
            i.setDescription(scan.nextLine());

            System.out.println("Enter in Quantity of item: ");
            i.setQuantity(scan.nextInt());
            scan.nextLine();

            System.out.println("Enter in Price of item: ");
            i.setUnitPrice(scan.nextInt());
            scan.nextLine();

            items.add(i);

            System.out.println("Would you like to continue adding more items?");
            answer=scan.nextLine();
            if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no"))
                stop=true;

        }while(!stop);

        for (Items eachItem : items) {
            System.out.println(eachItem.getDescription());

            saleValue = i.getUnitPrice() * i.getQuantity();
            taxAmount = i.getUnitPrice() * i.getQuantity() * tax;
            pricePerItem = i.getUnitPrice() * i.getQuantity();
            System.out.println("You owe " + (taxAmount + pricePerItem));
            answer = scan.nextLine();

            System.out.println("Description"+"          "+"Unit Price"+"          "+"Quantity"+"       "+"Total Price");
            System.out.println(i.getDescription()+"                  "+i.getUnitPrice()+"            "+i.getQuantity()+"             "+pricePerItem);




        }
        System.out.println("Thanks for shopping with us! ");

    }
}
