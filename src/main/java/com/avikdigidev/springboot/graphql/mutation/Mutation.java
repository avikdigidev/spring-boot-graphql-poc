package com.avikdigidev.springboot.graphql.mutation;

import com.avikdigidev.springboot.graphql.request.*;
import com.avikdigidev.springboot.graphql.response.*;
import com.avikdigidev.springboot.graphql.service.*;
import com.coxautodev.graphql.tools.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    StudentService studentService;

    public StudentResponse createStudent(CreateStudentRequest createStudentRequest){
        return new StudentResponse(studentService.createStudent(createStudentRequest));
    }
}
