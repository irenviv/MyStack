package com;

import java.util.EmptyStackException;

public class MyStack {

	 private Integer[] arr;    
	    private int size;
	    private final int MAX_STACK_SIZE;
	    
	    
	    public int getSize () {
	    	return size;
	    }
	    
    
	    
	    public MyStack(){
		       this(10);
		    }
	    
	    public MyStack(int stack_size){
	        MAX_STACK_SIZE = stack_size;
	        arr = new Integer[MAX_STACK_SIZE];
	    }
	    
	    public Integer push(Integer item){
	        if(size == MAX_STACK_SIZE){
	            throw new IndexOutOfBoundsException();
	        }
	        
	        arr[size++] = item;
	        return item;
	    }  
	    
	    public Integer peek(){
	        if(empty()){
	            throw new EmptyStackException();
	        }
	            
	        return arr[size-1];
	    }
	    
	    public Integer pop(){
	        if(empty()){
	            throw new EmptyStackException();
	        }
	        return arr[size--];
	    }
	    
	    public boolean empty(){
	        return (size == 0);
	    }
	}
