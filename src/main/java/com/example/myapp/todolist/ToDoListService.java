/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.myapp.todolist;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yifan
 */
@Service
public class ToDoListService {
    
    @Autowired
    private ToDoListRepository todolistRepository;
    
    
    public List<ToDo> getAllToDos()
    {
        //return todos;
        List<ToDo> todo = new ArrayList<>();
        todolistRepository.findAll()
                .forEach(todo::add);
        return todo;
    }
    
    
    public void addToDo(ToDo todo)
    {
        todolistRepository.save(todo);
    }
    
    public ToDo getToDoByID(Integer id)
    {
        return todolistRepository.findById(id).get();
    }
    
    public void updateToDo(Integer id, ToDo todo)
    {
        todolistRepository.save(todo);
    }
    
    public void deleteToDo(Integer id)
    {
        todolistRepository.deleteById(id);
    }
    
    
    
}
