package com.avikdigidev.springboot.graphql.service;

import com.avikdigidev.springboot.graphql.entity.Student;
import com.avikdigidev.springboot.graphql.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student getStudentById (long id) {
		return studentRepository.findById(id).get();
	}
}
