package com.NerbySoftTest.service.impl;

import com.NerbySoftTest.entity.TaskEntity;
import com.NerbySoftTest.repository.TaskRepository;
import com.NerbySoftTest.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void deleteTask(String id) {
        taskRepository.deleteById(id);
    }

    @Override
    public TaskEntity editTask(String id, TaskEntity taskEntity) throws Exception {
        taskRepository.findById(id).orElseThrow(Exception::new);
        taskEntity.setId(id);
        return taskRepository.save(taskEntity);
    }

    @Override
    public TaskEntity createTask(TaskEntity entity) {
        return taskRepository.save(entity);
    }

    @Override
    public List<TaskEntity> getAll() {
        return taskRepository.findAll();
    }
}
