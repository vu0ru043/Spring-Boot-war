package com.example.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("Test");
	}

	@Test
	public void test() throws Exception {
		int num = 1;
		Assertions.assertThat(num).isEqualTo(1);
	}
}
