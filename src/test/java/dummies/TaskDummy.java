package dummies;

import com.NerbySoftTest.entity.TaskEntity;

public class TaskDummy {

    public static TaskEntity createTask(String desc, String title, String id){
        TaskEntity entity = new TaskEntity();
        entity.setDescription(desc);
        entity.setTitle(title);
        entity.setId(id);
        return entity;
    }
}
