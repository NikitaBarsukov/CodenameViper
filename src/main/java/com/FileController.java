package com;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FileController {

    @RequestMapping("/")
    public String index() {
        return "The swift file hello";
    }
}