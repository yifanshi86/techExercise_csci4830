/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.myapp.todolist;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
/**
 *
 * @author yifan
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebMvcTest(value = ToDoListController.class,  secure = false)
public class ToDoListControllerTest {
    
    @Autowired
    private MockMvc mockMvc;
    
    @MockBean
    private ToDoListService todoService;
    
    public ToDoListControllerTest() {
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void findAll_Test() {
        ToDo first = new ToDo(1, "do howework");
        ToDo second = new ToDo(2, "oil change");
         
        Mockito.when(todoService.getAllToDos()).thenReturn(Arrays.asList(first, second));
         
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/todos").accept(
				MediaType.APPLICATION_JSON);

        try
        {
            MvcResult result = mockMvc.perform(requestBuilder).andReturn();

            System.out.println(result.getResponse());
            String expected = "{id:1,description:do homework,isDone:false}, {id:2,description:oil change,isDone:false}";

            JSONAssert.assertEquals(expected, result.getResponse()
                            .getContentAsString(), false);
        }
        catch (Exception e)
        {
        }
                 
         
     }
}
