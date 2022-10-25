package com.avikdigidev.springboot.graphql.repository;

import com.avikdigidev.springboot.graphql.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
