package com.NerbySoftTest.controller;

import com.NerbySoftTest.converter.TaskConverter;
import com.NerbySoftTest.entity.TaskEntity;
import com.NerbySoftTest.entity.TaskRequest;
import com.NerbySoftTest.entity.TaskResponse;
import com.NerbySoftTest.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@Validated
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TaskController {

    private final TaskService taskService;

    @RequestMapping(value = "/task/", method = RequestMethod.POST)
    public ResponseEntity<TaskResponse> createTask(@RequestBody final TaskRequest taskRequest) {
        TaskEntity task = taskService.createTask(TaskConverter.convert(taskRequest));
        return ResponseEntity.ok(TaskConverter.convert(task));
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deleteTaskById(@PathVariable("id") String id) {
        taskService.deleteTask(id);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.PUT)
    public ResponseEntity<TaskResponse> editTask(@PathVariable("id") String id,
                                                 @RequestBody final TaskRequest taskRequest) throws Exception {
        TaskEntity task = taskService.editTask(id, TaskConverter.convert(taskRequest));
        return ResponseEntity.ok(TaskConverter.convert(task));
    }

    @RequestMapping(value = "/allTasks", method = RequestMethod.GET)
    public ResponseEntity<List<TaskResponse>> getAllTasks() {
        List<TaskEntity> entities = taskService.getAll();
        return ResponseEntity.ok(entities.stream().map(TaskConverter::convert).collect(Collectors.toList()));
    }
}
