package com.avikdigidev.springboot.graphql.repository;

import com.avikdigidev.springboot.graphql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
