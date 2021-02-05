package com.cong.springsmapigateway.application;

import com.cong.springsmapigateway.dto.StudentDTO;
import com.google.common.net.HttpHeaders;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
@RequiredArgsConstructor
public class StudentsServiceClient {

    private final WebClient.Builder webClientBuilder;

    public Mono<StudentDTO> getStudentById(final int studentId){
        return webClientBuilder.build().get().uri("http://localhost:9001/api/student/find/{studentId}", studentId)
                .retrieve()
                .bodyToMono(StudentDTO.class);
    }

}


