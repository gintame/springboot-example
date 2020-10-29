package com.it;

import com.it.bean.Dog;
import com.it.bean.Person;
import com.it.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootConfigApplicationTests {

    @Autowired
    Person person;

    @Autowired
    Dog dog;


    @Autowired
    HelloService helloService;

	@Test
	void contextLoads() {

        System.out.println(person);

        System.out.println(dog);

        System.out.println(helloService);
	}

}
