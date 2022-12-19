package org.example.OrderProcessTemplate.concretes;

import org.example.OrderProcessTemplate.abstracts.OrderProcessTemplate;

public class InternetOrder extends OrderProcessTemplate {

  @Override
  public void doSelect() {

    System.out.println("Item added to basket");
    System.out.println("Get gift wrap preference");
    System.out.println("Get delivery address");

  }

  @Override
  public void doPayment() {

    System.out.println("Online Payment through Net banking or card");


  }

  @Override
  public void doDelivery() {

    System.out.println("Ship the item through post to delivery address");

  }
}
