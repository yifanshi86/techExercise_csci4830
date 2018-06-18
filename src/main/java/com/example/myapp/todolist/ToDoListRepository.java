/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.myapp.todolist;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author yifan
 */
public interface ToDoListRepository extends CrudRepository<ToDo, Integer> {
    
}
