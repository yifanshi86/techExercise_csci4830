/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.myapp.todolist;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author yifan
 */
public class ToDoTest {
    
    public ToDoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
     public void toDoConstructorTest() {
         ToDo todo = new ToDo();
         assertEquals(todo.toString(), "Task #0: is not done yet!");
         assertFalse(todo.isTaskDone());
         assertEquals(todo.getDescription(), "unknown");
     }
}
