package com.avikdigidev.springboot.graphql.repository;

import com.avikdigidev.springboot.graphql.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
