package org.example;

import org.example.OrderProcessTemplate.abstracts.OrderProcessTemplate;
import org.example.OrderProcessTemplate.concretes.InternetOrder;
import org.example.OrderProcessTemplate.concretes.StoreOrder;

public class Main {
  public static void main(String[] args) {

    OrderProcessTemplate netOrder = new InternetOrder();
    netOrder.processOrder(true);
    netOrder.processOrder(false);


    OrderProcessTemplate storeOrder = new StoreOrder();
    storeOrder.processOrder(true);
    storeOrder.processOrder(false);


  }
}