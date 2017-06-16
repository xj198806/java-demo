package com.example.observe;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by dwb on 2017/5/10.
 */
public class Boss implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("thank you !");
    }
}
