package org.factof5.grupo2sharedtodolist;

import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ToDoController {
    private List<Task> task;
    public TaskController() {
        tasks = new ArrayList<>();
    }

@GetMapping("/ToDoList")
public List<Task> allTasks() {return tasks;}

@PostMapping(/"ToDoList")
public ResponseEntity<String> addNewTask(Task task) {
    tasks.add(task);
    return new ResponseEntity<>("");
}

