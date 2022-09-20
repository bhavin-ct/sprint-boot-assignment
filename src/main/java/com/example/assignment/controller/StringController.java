package com.example.assignment.controller;

import com.example.assignment.services.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/v1")
public class StringController {

    @Autowired
    private StringService stringService;

    @GetMapping("/health-check")
    public String healthCheck(
            HttpServletRequest request) {
        return "Ok";
    }

    @GetMapping("/reverseString")
    public String reverseString(@RequestParam String str) {
        return stringService.reverseString(str);
    }

}
