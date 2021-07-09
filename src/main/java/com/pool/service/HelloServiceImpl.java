package com.pool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pool.modal.Programming;
import com.pool.repository.ProgrammingRepository;

@Service
public class HelloServiceImpl implements HelloService{
	@Autowired 
	private ProgrammingRepository programmingRepository;
	
	/*
	 * @Autowired public HelloServiceImpl(ProgrammingRepository
	 * programmingRepository) { this.programmingRepository = programmingRepository;
	 * }
	 */

	@Override
	public Programming saveProgramQuestion(Programming programming) {
		return programmingRepository.save(programming);
	}

	@Override
	public List<Programming> getProgramQuestions() {
		return programmingRepository.findAll();
	}

}
