package com.pool;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.stream;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.pool.modal.Programming;
import com.pool.repository.ProgrammingRepository;
import com.pool.service.HelloService;
import com.pool.service.HelloServiceImpl;

@SpringBootTest
public class HelloControllerMockTest {

	@Mock
	private ProgrammingRepository programmingRepository;

	@InjectMocks
	private HelloService helloService = new HelloServiceImpl();

	@BeforeEach
	void setMockOutput() {
		when(programmingRepository.findAll())
				.thenReturn(Stream
						.of(new Programming().setProgId(1).setProgQuestion("Whta is java"),
								new Programming().setProgId(2).setProgQuestion("Java8 featurs"))
						.collect(Collectors.toList()));
	}

	@Test
	public void getData() {

		assertEquals(2, helloService.getProgramQuestions().size());
	}

}
