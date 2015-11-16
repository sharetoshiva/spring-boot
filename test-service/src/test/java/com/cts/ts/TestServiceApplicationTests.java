package com.cts.ts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.dh.ts.TestServiceApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TestServiceApplication.class)
@WebAppConfiguration
public class TestServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
