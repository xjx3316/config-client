package com.didispace;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
@SpringApplicationConfiguration(classes = ConfigClientApplication.class)
public class ConfigClientApplicationTests {

	@Test
	public void contextLoads() {
	}

}
