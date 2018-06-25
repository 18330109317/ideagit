package com.li.spring.aop.aspect.jdk;

public class PersonDaoImpl implements PersonDao {
    @Override
    public void savePerson() {
        System.out.println("savePerson");
    }
}
