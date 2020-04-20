package com.Gregory.HelloWorldLombok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Thiago Araújo
 * @since 15/04/2020 - 23:17
 * @version 1.0
 */

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index() {
        return "Hello World!\nExample SpringBOOT with Lombok";
    }
}
