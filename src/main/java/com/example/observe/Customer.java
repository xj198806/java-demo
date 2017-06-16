package com.example.observe;

import java.util.Observable;

/**
 * Created by dwb on 2017/5/10.
 */
public class Customer extends Observable{

    public boolean pay(){
        System.out.println("pay success");
        this.setChanged();
        return true;
    }

}
