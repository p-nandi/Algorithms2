package com.pnandi.stack;

import org.junit.Assert;
import org.junit.Test;


public class StackWithArrayTest {

	@Test
	public void testStack() throws Exception{
	   Stack<Integer> s = new StackWithArray<>(4);
	   s.push(1);
	   s.push(2);
	   Assert.assertTrue(2 == s.peek());
	   s.pop();
	   Assert.assertTrue(1 == s.peek());
	   s.pop();
	   Assert.assertTrue(true == s.isEmpty());
	   s.push(3);
	   s.push(4);
	   s.push(5);
	   s.push(6);
	   Assert.assertTrue(false == s.isEmpty());
	}
}
