package com.avikdigidev.springboot.graphql;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GraphQLWithSpringBootApplication.class,
		webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GraphQLWithSpringBootApplicationTests {

	@Test
	void contextLoads() {
	}

}
