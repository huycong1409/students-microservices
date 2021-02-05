package com.cong.springsmapigateway.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Data
public class StudentDTO {

    private int id;

    private String firstName;

    private String lastName;

    private String email;

    private String address;

    private String phoneNumber;

}
