package com.pool.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pool.modal.Programming;

@Service
public interface HelloService {
	public Programming saveProgramQuestion(Programming programming);
	public List<Programming> getProgramQuestions();
	default String getWelcomeMessage() {
		return "Hello World!";
	}
	
	
}
