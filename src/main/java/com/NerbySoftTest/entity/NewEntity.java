package com.NerbySoftTest.entity;

public class NewEntity extends TaskEntity implements Entity{

    @Override
    public void testMethod() {
        System.out.println("new quoter");
    }
}
