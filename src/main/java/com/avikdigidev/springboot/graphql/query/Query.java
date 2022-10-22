package com.avikdigidev.springboot.graphql.query;

import com.avikdigidev.springboot.graphql.request.NameRequest;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {

    public String firstQuery() {

        return "First Query";
    }

    public String secondQuery() {

        return "Second Query";
    }
    public String fullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }

    public String fullNameRequest(NameRequest name){
        return name.getFirstName() + " "+name.getLastName();
    }
}
