/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.myapp.todolist;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author yifan
 */
@Entity
public class ToDo {
    @Id
    private Integer id;
    private String description;
    private boolean isDone;
    
    public ToDo()
    {
        id = 0;
        description = "unknown";
        isDone = false;
    }
    public ToDo(Integer inId, String descrp)
    {
        id = inId;
        description = descrp;
        isDone = false;
    }
    
    public void setTaskDone()
    {
        isDone = true;
    }
    
    public boolean isTaskDone()
    {
        return isDone;
    }
    
    public void setDescription( String newDescrp)
    {
        description = newDescrp;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setID(Integer newID)
    {
        id = newID;
    }
    
    public Integer getID()
    {
        return id;
    }
    
    @Override
    public String toString()
    {
        String s = String.format("Task #%d: %s", getID(), getDescription());
        if (isTaskDone())
        {
            s = s + "is done!";
        }
        else
        {
            s = s + "is not done yet!";
        }
        
        return s;
    }
}
