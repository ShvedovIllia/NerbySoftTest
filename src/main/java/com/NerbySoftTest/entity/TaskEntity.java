package com.NerbySoftTest.entity;


import com.NerbySoftTest.beanConfiguration.Profiling;
import com.NerbySoftTest.beanConfiguration.RandomValueIllia;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.PostConstruct;

@Getter
@Setter
@Document(collection = "tasks")

@Profiling
@DeprecatedClass(newImpl = NewEntity.class)
public class TaskEntity implements Entity {

    @Id
    private String id;
    private String title;
    private String description;

    private String taskField;

    @RandomValueIllia(min = 2, max = 9)
    private int someValue;

    public TaskEntity() {
        System.out.println("Default constructor");
    }

    @PostConstruct
    private void init() {
        System.out.println("Second phase of constructor");
    }

    @Override
    @PostProxy
    public void testMethod() {
        System.out.println("Third phase with application context");
        for (int i = 0; i < someValue; i++) {
            System.out.println(taskField);
        }
    }


}
