package com.avikdigidev.springboot.graphql.response;

import java.util.ArrayList;
import java.util.List;


import com.avikdigidev.springboot.graphql.entity.Student;
import com.avikdigidev.springboot.graphql.entity.Subject;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentResponse {

	private long id;

	private String firstName;

	private String lastName;

	private String email;
	
	private String street;

	private String city;
	
	private List<SubjectResponse> learningSubjects;
	//this is for internal use. DO NOT PUT IN SCHEMA
	private Student student;

	public StudentResponse (Student student) {
		this.student= student;
		this.id = student.getId();
		this.firstName = student.getFirstName();
		this.lastName = student.getLastName();
		this.email = student.getEmail();
		
		this.street = student.getAddress().getStreet();
		this.city = student.getAddress().getCity();


		/*Below line works for REST API but its not good for GraphQL queries
		* as it is not always required to get the subject details*/
/*		if (student.getLearningSubjects() != null) {
			learningSubjects = new ArrayList<SubjectResponse>();
			for (Subject subject: student.getLearningSubjects()) {
				learningSubjects.add(new SubjectResponse(subject));
			}
		}*/
	}

}
