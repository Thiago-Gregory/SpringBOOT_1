package com.Gregory.HelloWorldNoLombok.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Thiago Araújo
 * @since 15/04/2020 - 22:10
 * @version 1.0
 */
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Hello World! :D";
    }
}
