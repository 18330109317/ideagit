package com.li.spring.aop.aspect.jdk;

import java.lang.reflect.Proxy;

public class PersonClient {
    public static void main(String[] args) {
//        PersonDaoImpl personDaoImpl=new PersonDaoImpl();
        PersonDao personDaoImpl=new PersonDaoImpl();
        Transaction transaction=new Transaction();

        PersonIntercepter personIntercepter=new PersonIntercepter(personDaoImpl,transaction);
        PersonDao personDao= (PersonDao) Proxy.newProxyInstance(personDaoImpl.getClass().getClassLoader(),personDaoImpl.getClass().getInterfaces(),personIntercepter);
        personDao.savePerson();
        123456

    }
}
