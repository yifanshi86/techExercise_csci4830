/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.myapp.todolist;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yifan
 */
@RestController
public class ToDoListController {
    
    @Autowired
    private ToDoListService todolistService;

    @RequestMapping("/hi")
    @ResponseBody
    public String sayHi() {
        return "Hello from restcontroller!";
    }
    
    @RequestMapping("/todos")
    public List<ToDo> getAllToDo()
    {
        return todolistService.getAllToDos();
    }
    
    @RequestMapping("/todos/{id}")
    public ToDo getToDo(@PathVariable Integer id){
        return todolistService.getToDoByID(id);
    }

    @PostMapping("/todos")
    public void addToDo(@RequestBody ToDo todo) {
        todolistService.addToDo(todo);
    }
    
    @PutMapping("/todos/{id}")
    public void updateToDo(@RequestBody ToDo todo, @PathVariable Integer id) {
        todolistService.updateToDo(id, todo);
    }
    
    @DeleteMapping("/todos/{id}")
    public void deleteToDo(@PathVariable Integer id){
        todolistService.deleteToDo(id);
    }
}
