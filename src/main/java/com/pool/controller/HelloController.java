package com.pool.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pool.modal.Programming;
import com.pool.service.HelloService;

@RestController
public class HelloController {
	private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/")
    public @ResponseBody String greeting() {
        return helloService.getWelcomeMessage();
    }
    
    @GetMapping("/alpa")
    public Map<String,String> getData(){
    	return Map.of("A","APPLE","B","BALL");
    }
    
    @PostMapping("/saveprogramm")
    public Programming saveProgramming(@RequestBody Programming programming) {
    	return helloService.saveProgramQuestion(programming);
    }
    
    @GetMapping("/findall")
    public List<Programming> getAllProgramms(){
    	return helloService.getProgramQuestions();
    }
    
}
