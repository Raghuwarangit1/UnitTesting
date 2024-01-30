package com.nt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.controller.StudentController;
import com.nt.entity.Student;
import com.nt.service.StudentService;

@WebMvcTest(value=StudentController.class)
public class StudentControllerTest {
	@MockBean
private StudentService service;
	@Autowired
private MockMvc mvc;
@Test
	public void save() throws Exception {
	when(service.save(ArgumentMatchers.any())).thenReturn(true);
	Student s = new Student(1,"Wardhan");
ObjectMapper mapper = new ObjectMapper();
String string = mapper.writeValueAsString(s);
MockHttpServletRequestBuilder content = MockMvcRequestBuilders.post("/save").contentType(MediaType.APPLICATION_JSON).content(string);
ResultActions perform = mvc.perform(content);
MvcResult andReturn = perform.andReturn();
MockHttpServletResponse response = andReturn.getResponse();
int status = response.getStatus();
assertEquals(200, status);
	
}
@Test
public void save1() throws Exception {
when(service.save(ArgumentMatchers.any())).thenReturn(false);
Student s = new Student(1,"Wardhan");
ObjectMapper mapper = new ObjectMapper();
String string = mapper.writeValueAsString(s);
MockHttpServletRequestBuilder content = MockMvcRequestBuilders.post("/save").contentType(MediaType.APPLICATION_JSON).content(string);
ResultActions perform = mvc.perform(content);
MvcResult andReturn = perform.andReturn();
MockHttpServletResponse response = andReturn.getResponse();
int status = response.getStatus();
assertEquals(400, status);

}
}
