package com.test.Thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TraditionalThread {
    public static void main(String[] args) throws InterruptedException {
       new Thread(new Runnable() {
           @Override
           public void run() {
               for(in0t i=1;i<=10;i++)
               {
                   System.out.println("seb:"+i);
               }
           }
       }).start();
    }
}
