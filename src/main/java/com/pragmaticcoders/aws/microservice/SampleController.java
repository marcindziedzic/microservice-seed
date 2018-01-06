package com.pragmaticcoders.aws.microservice;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;

@RestController
public class SampleController {

    @RequestMapping("/api")
    public ApiResponse api(
            @RequestHeader(value = "X-SampleId", required = false) String sampleId,
            @RequestParam(value = "test", required = false) String test) {

        long timestamp = Instant.now().toEpochMilli();

        ApiResponse rsp = new ApiResponse();
        rsp.setSampleId(sampleId);
        rsp.setTest(test);
        rsp.setTimestamp(timestamp);

        return rsp;
    }
}
