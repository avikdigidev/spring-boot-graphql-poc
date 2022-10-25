package com.avikdigidev.springboot.graphql.query.resolver;

import com.avikdigidev.springboot.graphql.entity.*;
import com.avikdigidev.springboot.graphql.query.edge.*;
import com.avikdigidev.springboot.graphql.response.*;
import com.coxautodev.graphql.tools.*;
import org.springframework.stereotype.*;

import java.util.*;
import java.util.stream.*;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {

    public List<SubjectResponse> getLearningSubjects(StudentResponse studentResponse, List<String> subjectNameFilter) {
        List<SubjectResponse> learningSubjects = new ArrayList<>();

        if (studentResponse.getStudent().getLearningSubjects() != null) {

            for (Subject subject : studentResponse.getStudent().getLearningSubjects()) {
                List<String> collect = subjectNameFilter.stream().filter(s -> s.equalsIgnoreCase(subject.getSubjectName())).collect(Collectors.toList());
                if(collect.contains(subject.getSubjectName())){
                    learningSubjects.add(new SubjectResponse(subject));
                }

            }
        }
        return learningSubjects;
    }
}
