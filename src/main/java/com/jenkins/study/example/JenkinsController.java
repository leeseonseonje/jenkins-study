package com.jenkins.study.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class JenkinsController {

    @GetMapping("/jenkins")
    public String helloJenkins() {
        log.info("hello jenkins!");
        return "hello jenkins";
    }
}
