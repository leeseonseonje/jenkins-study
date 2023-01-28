package com.jenkins.study.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(JenkinsController.class)
class JenkinsControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void hello_jenkins() throws Exception {
        this.mockMvc.perform(get("/jenkins"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello jenkins"))
                .andDo(print());
    }

}