package com.example.helloworld;

import com.example.helloworld.config.HelloEnviornment;
import com.example.helloworld.repositories.HelloRepository;
import com.example.helloworld.controller.HelloWorldController;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


// import static org.junit.jupiter.api.Assertions.assertNotNull;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = HelloWorldApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class HelloWorldApplicationTests extends HelloEnviornment{

    // @Autowired
    // private HelloWorldController helloWorldController;

    // @Test
    // void contextLoads() {
    //     // to ensure that controller is getting created inside the application context
    //     assertNotNull(helloWorldController);
    // }

    @Autowired
    private HelloRepository HelloRepository;

    @Test
    public void When_GetProducts_Expect_EmptyList(){
        List<HelloWorldController> list = HelloRepository.findAll();
        assertEquals(0, list.size());
    }
}
