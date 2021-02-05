package com.cong.springsmapigateway.controller;

import com.cong.springsmapigateway.application.StudentsServiceClient;
import com.cong.springsmapigateway.dto.StudentDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/gateway")
@RequiredArgsConstructor
public class ApiGatewayController {

    private final StudentsServiceClient studentsServiceClient;

    @GetMapping(value = "/student/{studentId}")
    public Mono<StudentDTO> getStudentById(final @PathVariable int studentId) {
        return studentsServiceClient.getStudentById(studentId);
    }
}
