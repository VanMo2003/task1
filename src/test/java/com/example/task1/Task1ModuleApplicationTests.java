package com.example.task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task1ModuleApplicationTests {

	@Test
	public void testSumPositiveNumbers() {
		assertEquals("777", MyBigNumber.sum("345", "432"));
	}

	@Test
	public void testSumWithZero() {
		assertEquals("453", MyBigNumber.sum("453", "0"));
	}
}
