package com.pool;

import com.pool.controller.TestController;
import com.pool.modal.MyResponse;
import com.pool.repository.MyResponseRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
public class TestControllerTest {


    @InjectMocks
    TestController testController;

    @Mock
    MyResponseRepository myResponseRepository;


    @BeforeEach
    public void before(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void sayHello() throws Exception {
        MyResponse myResponse1 = new MyResponse();
        myResponse1.setDescription("welcome");
        myResponse1.setName("shiva");
        MyResponse response = testController.sayHello("shiva","welcome");
        assertEquals("welcome", response.getDescription());

    }
}
