package com.cts.ecart.resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/products")
@CrossOrigin
public class ProductRestResource {

    @GetMapping
    public String f1(){
        return "Welcome to my APP .........";

    }
}
