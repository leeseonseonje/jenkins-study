package com.jenkins.study.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping("/jenkins")
    public String helloJenkins() {
        return "helloJenkins";
    }
}
