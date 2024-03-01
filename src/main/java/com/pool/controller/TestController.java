package com.pool.controller;

import com.pool.modal.MyResponse;
import com.pool.repository.MyResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private MyResponseRepository myResponseRepository;

    @GetMapping("/api/test/insert/{name}/{description}")
    public MyResponse sayHello(@PathVariable("name") String name, @PathVariable("description") String description){
        MyResponse myResponse =new MyResponse();
        myResponse.setName(name);
        myResponse.setDescription(description);
        myResponseRepository.save(myResponse);
        return myResponse;
    }
}
