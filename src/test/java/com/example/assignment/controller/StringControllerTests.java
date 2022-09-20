package com.example.assignment.controller;

import com.example.assignment.services.StringService;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.mockito.Mockito.when;

@WebMvcTest(StringController.class)
public class StringControllerTests {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StringService stringService;

    @Test
    public void testReverseString() throws Exception {
        when(stringService.reverseString("Test")).thenReturn("tseT");
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                "/v1/reverseString?str=Test");
        mockMvc.perform(requestBuilder)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string(Matchers.equalTo("tseT")));
    }
}
