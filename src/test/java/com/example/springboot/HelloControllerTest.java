package com.example.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private HelloController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void index() throws Exception {
        assertEquals("Yo from Spring Boot + Tanzu + happy friyay! + another failure - Supply Chain. IVS 8 - TASK RUN 3", controller.index());

        mockMvc
            .perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(content().string("Yo from Spring Boot + Tanzu + happy friyay! + another failure - Supply Chain. IVS 8 - TASK RUN 3"));
    }
}
