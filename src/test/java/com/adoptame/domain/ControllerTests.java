package com.adoptame.domain;

import com.adoptame.domain.controller.PetController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ControllerTests {
	@Autowired
	private PetController petController;

	@Test
	public void contextLoads(){
		assertNotNull(petController);
	}

}