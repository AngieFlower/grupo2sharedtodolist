package org.factof5.grupo2sharedtodolist.controllers;

import org.factof5.grupo2sharedtodolist.model.Task;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {
    private final List<Task> tasks = new ArrayList<>();

    @GetMapping("/tasks")
    public List<Task> allTasks(){
        return tasks;
 }
    @PostMapping("/tasks")
    public void addTask(Task task){
        tasks.add(task);
    }

@DeleteMapping ("/tasks/{index}")
    void deleteTask(@PathVariable int index) {
        tasks.remove(index);
    }


}
