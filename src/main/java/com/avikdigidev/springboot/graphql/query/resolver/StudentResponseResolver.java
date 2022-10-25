package com.avikdigidev.springboot.graphql.query.resolver;

import com.avikdigidev.springboot.graphql.entity.*;
import com.avikdigidev.springboot.graphql.response.*;
import com.coxautodev.graphql.tools.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {

    public List<SubjectResponse> getLearningSubjects(StudentResponse studentResponse) {
        List<SubjectResponse> learningSubjects = new ArrayList<SubjectResponse>();

        if (studentResponse.getStudent().getLearningSubjects() != null) {

            for (Subject subject : studentResponse.getStudent().getLearningSubjects()) {
                learningSubjects.add(new SubjectResponse(subject));
            }
        }
        return learningSubjects;
    }
}
