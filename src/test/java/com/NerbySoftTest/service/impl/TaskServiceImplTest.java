package com.NerbySoftTest.service.impl;

import com.NerbySoftTest.entity.TaskEntity;
import com.NerbySoftTest.repository.TaskRepository;
import com.NerbySoftTest.service.TaskService;
import dummies.TaskDummy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskServiceImplTest {

    @MockBean
    private TaskRepository taskRepository;
    @Autowired
    private TaskService taskService;

    @Before
    public void setUp() throws Exception {
        TaskEntity taskDummy = TaskDummy.createTask("newDesc", "newTitle", "id");
        Mockito.when(taskRepository.save(new TaskEntity())).thenReturn(taskDummy);
        Mockito.when(taskRepository.findById("id")).thenReturn(Optional.of(taskDummy));
    }

    @Test
    public void editTaskTest() throws Exception {
        TaskEntity taskDummy = TaskDummy.createTask("newDesc", "newTitle", "id");
        TaskEntity entity = taskService.editTask("id", new TaskEntity());
        Assert.assertEquals("newDesc", entity.getDescription());
    }

    @Test
    public void createTask() {

        TaskEntity entity = taskService.createTask(new TaskEntity());
        Assert.assertEquals("newDesc", entity.getDescription());
    }

    @Test
    public void getAll() {
    }
}