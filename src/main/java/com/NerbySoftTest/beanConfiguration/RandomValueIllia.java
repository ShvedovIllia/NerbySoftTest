package com.NerbySoftTest.beanConfiguration;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RandomValueIllia {
    int min();
    int max();
}
