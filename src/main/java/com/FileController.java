package com;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

@RestController
public class FileController {

    @RequestMapping("/doit")
    public byte[] index() throws IOException {
        InputStream in = getClass()
                .getResourceAsStream("hello.swift");
        return IOUtils.toByteArray(in);
    }
}