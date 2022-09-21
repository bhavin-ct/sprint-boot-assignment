package com.example.assignment.services;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@WebMvcTest(StringService.class)
public class StringServiceTests {

    @InjectMocks
    StringService stringService;

    @Test
    public void testReverseString() throws Exception {
        String reverseString = stringService.reverseString("Test");
        assertEquals(reverseString, "tseT");
    }
}
