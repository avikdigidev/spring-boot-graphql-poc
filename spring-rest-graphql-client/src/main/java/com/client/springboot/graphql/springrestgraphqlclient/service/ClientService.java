package com.client.springboot.graphql.springrestgraphqlclient.service;

import com.client.springboot.graphql.springrestgraphqlclient.request.*;
import com.client.springboot.graphql.springrestgraphqlclient.response.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import graphql.kickstart.spring.webclient.boot.GraphQLRequest;
import graphql.kickstart.spring.webclient.boot.GraphQLResponse;
import graphql.kickstart.spring.webclient.boot.GraphQLWebClient;

import java.util.*;

@Service
public class ClientService {
	
	@Autowired
	GraphQLWebClient graphQLWebClient;

	public StudentResponse getStudent (Integer id) {
		Map<String, Object> variables = new HashMap<>();
		variables.put("id", id);

		String queryStr = "query getStudent($id : Int){\r\n"
				+ "  getStudent(id : $id) {\r\n"
				+ "    id\r\n"
				+ "    firstName\r\n"
				+ "    lastName\r\n"
				+ "    email\r\n"
				+ "    street\r\n"
				+ "    city\r\n"
				+ "    learningSubjects {\r\n"
				+ "      id\r\n"
				+ "      subjectName\r\n"
				+ "      marksObtained\r\n"
				+ "    }\r\n"
				+ "  } \r\n"
				+ "}";
		
		GraphQLRequest request = GraphQLRequest.builder()
				.query(queryStr).variables(variables).build();
		
		GraphQLResponse graphQLResponse = graphQLWebClient.post(request).block();
		
		return graphQLResponse.get("getStudent", StudentResponse.class);
	}

	public StudentResponse createStudent(
			CreateStudentRequest createStudentRequest) {

		Map<String, Object> variables = new HashMap<>();
		variables.put("createStudentRequest", createStudentRequest);

		String mutationStr = "mutation createStudent ($createStudentRequest : CreateStudentRequest) {\r\n"
				+ "  createStudent (createStudentRequest : $createStudentRequest) {\r\n"
				+ "    id\r\n"
				+ "    firstName\r\n"
				+ "    lastName\r\n"
				+ "    email\r\n"
				+ "    street\r\n"
				+ "    city\r\n"
				+ "    learningSubjects {\r\n"
				+ "      id\r\n"
				+ "      subjectName\r\n"
				+ "      marksObtained\r\n"
				+ "    }\r\n"
				+ "  }\r\n"
				+ "}";

		GraphQLRequest request = GraphQLRequest.builder()
				.query(mutationStr).variables(variables).build();

		GraphQLResponse graphQLResponse = graphQLWebClient.post(request).block();

		return graphQLResponse.get("createStudent", StudentResponse.class);
	}
}
