package com.example.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ListManagerTests {

	ListManager manager;

	@Before
	public void setUp() {
		manager = new ListManager();
	}

	@Test
	public void ListManagerHasItems() {
		// arrange
		// ListManager manager = new ListManager();

		// act

		// assert
		assertEquals(0, this.manager.getItems().size());
	}

	@Test
	public void addItemWorks() {
		// arrange

		// act
		this.manager.addItem("test");

		// assert
		assertEquals("est", manager.getItems().get(0));
	}

}
