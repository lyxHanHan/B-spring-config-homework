package com.thoughtworks.capability.gtb.demospringconfig;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@ActiveProfiles
@SpringBootTest
class DemoSpringConfigApplicationTests {

	@Autowired
	private LevelController levelController;

	@Test
	public void shouldTestLevelController_overridePropertyValues() {
		String levelNumber = levelController.getLevel();
		assertEquals("advanced", levelNumber);
	}
}
