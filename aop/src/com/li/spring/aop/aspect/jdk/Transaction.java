package com.li.spring.aop.aspect.jdk;

public class Transaction {
    public void transaction(){
        System.out.println("transaction");
    }
    public void commit(){
        System.out.println("commit");
    }
}
