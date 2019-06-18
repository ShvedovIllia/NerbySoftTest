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
public class TaskEntity implements Entity{

    @Id
    private String id;
    private String title;
    private String description;

    private String taskField;

    @RandomValueIllia(min = 2, max = 9)
    private int someValue;

    @PostConstruct
    private void init(){
        System.out.println("Second phase of constructor");
    }

    public TaskEntity() {
        System.out.println("Default constructor");
    }

    @Override
    @PostProxy
    public void testMethod () {
        for (int i = 0; i < someValue; i++) {
            System.out.println(taskField);
        }
    }
}
