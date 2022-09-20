package com.example.assignment.services;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String reverseString (String str) {
        System.out.println("String :: " + str);
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

}
