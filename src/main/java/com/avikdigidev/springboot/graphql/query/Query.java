package com.avikdigidev.springboot.graphql.query;

import com.avikdigidev.springboot.graphql.request.NameRequest;
import com.avikdigidev.springboot.graphql.response.StudentResponse;
import com.avikdigidev.springboot.graphql.service.StudentService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
@Autowired
    StudentService studentService;
    public String firstQuery() {

        return "First Query";
    }

    public String secondQuery() {

        return "Second Query";
    }

    public String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public String fullNameRequest(NameRequest name) {
        return name.getFirstName() + " " + name.getLastName();
    }

    public StudentResponse getStudent(long id){
        return new StudentResponse(studentService.getStudentById(id));
    }
}
