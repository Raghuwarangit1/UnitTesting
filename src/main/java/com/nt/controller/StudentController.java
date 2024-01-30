package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.nt.entity.Student;
import com.nt.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Student s) {
		Boolean save = service.save(s);

		if (save)
          return new ResponseEntity<String>("student is saved", HttpStatus.OK);
		
		else
			return new ResponseEntity<String>("student is not  saved", HttpStatus.BAD_REQUEST);

	}
}
