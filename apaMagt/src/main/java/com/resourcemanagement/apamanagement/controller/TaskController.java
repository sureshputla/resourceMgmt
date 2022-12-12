package com.resourcemanagement.apamanagement.controller;


import com.resourcemanagement.apamanagement.model.Task;
import com.resourcemanagement.apamanagement.model.TaskDTO;
import com.resourcemanagement.apamanagement.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @PostMapping(path = "tasks", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Task> createTask(@RequestBody TaskDTO taskDTO){
        try {
            Task task = new Task(taskDTO);
            return new ResponseEntity<>(taskRepository.save(task), HttpStatus.CREATED);
        } catch (Exception ex){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(path = "tasks",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Task>> getAllTasks(){
        List<Task> tasks = taskRepository.findAll(Sort.by("id"));
        return new ResponseEntity<>(tasks, HttpStatus.OK);
    }


}
