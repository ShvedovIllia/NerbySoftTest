package com.NerbySoftTest.beanConfiguration;
/*  *Annotation created by Illia in IntelliJ IDEA
 *Date: 21.06.2019
 *Time: 16:59
 *System user: Asus*/

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface NewRandomIllia {
    int min();

    int max();

}
