package com.pnandi.stack;

public class StackWithArray<T> implements Stack<T>{

	//index of the top of the stack
	private int top;
	
	//size of the stack
	private int size;
	
	private T[] array;
	
	public StackWithArray(int size){
		top = -1;
		this.size = size;
		this.array = (T[])new Object[size];
	}
	
	@Override
	public void push(T t) throws StackOverflowException{
        if (top == size-1) throw new StackOverflowException("Stack is full");
        array[++top] = t;
	}

	@Override
	public T pop() throws StackUnderflowException{
        if (top == -1) throw new StackUnderflowException("Stack is empty");
        return array[top--];
	}

	@Override
	public T peek() throws StackUnderflowException{
         if (top == -1) throw new StackUnderflowException("Stack is empty");
         return array[top];
	}

	@Override
	public boolean isEmpty() {
        return top == -1; 
	}


}
