package org.factof5.grupo2sharedtodolist.controllers;

import org.factof5.grupo2sharedtodolist.model.Task;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;


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
    public RedirectView addTask(Task task){
        tasks.add(task);
        return new RedirectView("/");
    }

    @DeleteMapping ("/tasks/{index}")
    void deleteTask(@PathVariable int index) {
        tasks.remove(index);
    }


}
