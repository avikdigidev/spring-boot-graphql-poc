package com.avikdigidev.springboot.graphql.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NameRequest {
    private String firstName;
    private String lastName;
}
