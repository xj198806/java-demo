package com.example.thread;

/**
 * Created by dwb on 2017/5/22.
 */
public class JoinDemo {
    public static void main(String[] args){
        JoinThread thread = new JoinThread();
        thread.start();
        /*try {
            thread.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }*/
        System.out.println("main over...");

    }
}

class JoinThread extends Thread{

    @Override
    public void run(){
        System.out.println("join thread running...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("join thread over...");
    }

}
