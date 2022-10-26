package com.avikdigidev.springboot.graphql.service;

import com.avikdigidev.springboot.graphql.entity.*;
import com.avikdigidev.springboot.graphql.repository.*;
import com.avikdigidev.springboot.graphql.request.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class StudentService {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    StudentRepository studentRepository;

    public Student getStudentById(long id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()){
            return student.get();
        }
        return null;
    }

    public Student createStudent(CreateStudentRequest createStudentRequest) {
        Student student = new Student(createStudentRequest);

        Address address = new Address();
        address.setStreet(createStudentRequest.getStreet());
        address.setCity(createStudentRequest.getCity());
        address = addressRepository.save(address);

        student.setAddress(address);
        student = studentRepository.save(student);

        List<Subject> subjectsList = new ArrayList<>();
        if (createStudentRequest.getSubjectsLearning() != null) {
            for (CreateSubjectRequest createSubjectRequest : createStudentRequest.getSubjectsLearning()) {
                Subject subject = new Subject();
                subject.setSubjectName(createSubjectRequest.getSubjectName());
                subject.setMarksObtained(createSubjectRequest.getMarksObtained());
                subject.setStudent(student);
                subjectsList.add(subject);
            }
            subjectRepository.saveAll(subjectsList);
        }
        student.setLearningSubjects(subjectsList);
        return student;
    }
}
