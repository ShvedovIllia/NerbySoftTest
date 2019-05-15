package com.NerbySoftTest.service;

import com.NerbySoftTest.entity.TaskEntity;

import java.util.List;

public interface TaskService {

    void deleteTask(String id);

    TaskEntity editTask(String id, TaskEntity taskEntity) throws Exception;

    TaskEntity createTask(TaskEntity entity);

    List<TaskEntity> getAll();
}
