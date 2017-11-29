package com.example.demo.demo1;

import org.springframework.stereotype.Service;

//@Service
public class FunctionService {

    public String sayHallo(String word){
        return "hello" + word + "!";
    }
}
