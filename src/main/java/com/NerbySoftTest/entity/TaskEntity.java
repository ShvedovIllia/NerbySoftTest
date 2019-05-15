package com.NerbySoftTest.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "tasks")
public class TaskEntity {

    @Id
    private String id;
    private String title;
    private String description;
}
