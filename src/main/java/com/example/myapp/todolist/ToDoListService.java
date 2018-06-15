/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.myapp.todolist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author yifan
 */
@Service
public class ToDoListService {
    private List<ToDo> todos = new ArrayList<>(Arrays.asList(
    new ToDo(0, "shopping for grocery"),
    new ToDo(1, "homework for csci4830"),
    new ToDo(2, "get vehcile window glass replaced")));
    
//    public ToDoListService()
//    {
//        tasks = new ArrayList<ToDo>();
//    }
    
    public List<ToDo> getAllToDos()
    {
        return todos;
    }
    
    
    public void addToDoByDescription(String tskDescrp)
    {
        int id = todos.size();
        todos.add(new ToDo(id, tskDescrp));
    }
    
    public void addToDo(ToDo todo)
    {
        todos.add(todo);
    }
    
    public ToDo getToDoByID(int id)
    {
        for (int i = 0; i < todos.size(); i++)
        {
            ToDo temp = todos.get(i);
            if (temp.getID() == id)
            {
                return temp;
            }
        }
        return null;
    }
    
    public ToDo getToDoByDescription(String tskDescrp)
    {
        for (int i = 0; i < todos.size(); i++)
        {
            ToDo temp = todos.get(i);
            if (temp.getDescription().equals(tskDescrp))
            {
                return temp;
            }
        }

        return null;
    }
    
    public void updateToDo(int id, ToDo todo)
    {
        for (int i = 0; i < todos.size(); i++)
        {
            ToDo temp = todos.get(i);
            if (temp.getID() == id)
            {
                todos.set(i, todo);
                break;
            }
        }
    }
    
    public void deleteToDo(int id)
    {
        for (int i = 0; i < todos.size(); i++)
        {
            if (todos.get(i).getID() == id)
            {
                todos.remove(i);
                break;
            }
        }
    }
    
    
    
}
