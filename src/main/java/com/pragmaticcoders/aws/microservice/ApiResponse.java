package com.pragmaticcoders.aws.microservice;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ApiResponse {
    private String sampleId;
    private String test;
    private long timestamp;
}
