package com.example.DockerSpringBootApplication.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "docker")
public class DockerController {

    @RequestMapping(value = "api", method = RequestMethod.GET)
    public ResponseEntity<String> getDockerData(){
        return ResponseEntity.ok("Hi I am Docker Container");
    }
}
