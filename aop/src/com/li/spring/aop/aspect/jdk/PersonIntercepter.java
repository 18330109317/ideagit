package com.li.spring.aop.aspect.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonIntercepter implements InvocationHandler {
    public Object targrt;
    public Transaction transaction;

    public PersonIntercepter(Object targrt, Transaction transaction) {
        this.targrt = targrt;
        this.transaction = transaction;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        transaction.transaction();
        method.invoke(targrt,args);
        transaction.commit();

        return null;
    }
}
