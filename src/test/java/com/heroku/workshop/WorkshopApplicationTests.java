package com.heroku.workshop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkshopApplicationTests {
	@Test
	public void contextLoads() {
	}
	@Test
	public void dummyTest(){
		System.out.println("foobar!");
	}
	@Test
	public void newShinyFeatureTest() {
		System.out.println("newShinyFeatureTest()");
	}
}
