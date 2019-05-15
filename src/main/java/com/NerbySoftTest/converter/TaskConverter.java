package com.NerbySoftTest.converter;

import com.NerbySoftTest.entity.TaskEntity;
import com.NerbySoftTest.entity.TaskRequest;
import com.NerbySoftTest.entity.TaskResponse;
import org.springframework.stereotype.Component;

@Component
public class TaskConverter {

    public static TaskEntity convert(TaskRequest taskRequest) {
        TaskEntity entity = new TaskEntity();
        entity.setTitle(taskRequest.getTitle());
        entity.setDescription(taskRequest.getDescription());
        return entity;
    }

    public static TaskResponse convert(TaskEntity taskEntity) {
        TaskResponse response = new TaskResponse();
        response.setDescription(taskEntity.getDescription());
        response.setTitle(taskEntity.getTitle());
        return response;
    }
}
