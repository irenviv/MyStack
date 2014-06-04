package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.util.NoSuchElementException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyStackTest {
	
	public MyStack stack;
	
	@Before
	public void setUp() throws Exception {
		stack = new MyStack ();
	}
	
	@Test 
	public void verifyStackEmpty () {
		assertTrue(stack.empty());
		assertEquals(stack.getSize(), 0);
	}
	
	@Test 
	public void verifyPushMethod () {
		int numberOfPushes = 3;
		for (int i = 0; i < numberOfPushes; i ++) {
			stack.push(12);
		}
		
		assertFalse(stack.empty());
		assertEquals(stack.getSize(), numberOfPushes);
		System.out.println("The size of stack after push is  " + stack.getSize());
	}	
		
	@Test 
	public void verifyPeekMethod () {
		int item = 1;
		stack.push(item);	
		stack.peek();
		
		assertFalse(stack.empty());
		assertEquals(stack.getSize(), item);
		System.out.println("The size of stack after peek is  " + stack.getSize());
		System.out.println("The main element is " + stack.peek());
	}
	
	@Test
	public void verifyPopMethod () {
		int numberOfPushes = 3;
		for (int i = 0; i < numberOfPushes; i ++) {
			stack.push(12);
		}
		
		for (int i = 0; i < numberOfPushes; i ++) {
			stack.pop();
		}
		
		assertTrue(stack.empty());
		assertEquals(stack.getSize(), 0);
		
	}
	
	@Test (expected = NoSuchElementException.class)
	public void testPopWhenStackIsEmpty () {
		assertTrue(stack.empty());
		stack.pop();
	}
	
	
	@After
	public void tearDown() throws Exception {
		
	}


}
