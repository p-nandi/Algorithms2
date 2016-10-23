package com.pnandi.stack;

public interface Stack<T> {

	public void push(T t) throws StackOverflowException;
	
	public T pop() throws StackUnderflowException;
	
	public T peek() throws StackUnderflowException;
	
	public boolean isEmpty();
	
}
