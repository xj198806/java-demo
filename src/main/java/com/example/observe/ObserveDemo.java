package com.example.observe;

/**
 * Created by dwb on 2017/5/10.
 */
public class ObserveDemo {

    public static void main(String[] args){
        Customer customer = new Customer();
        customer.addObserver(new Boss());
        customer.pay();
        customer.notifyObservers();
    }

}
