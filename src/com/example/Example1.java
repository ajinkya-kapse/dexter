/**
 * com.test
 * Example1.java
 * 1:10:05 PM||15-Dec-2018
 * By:Ajinkya
 */
package com.example;

import com.framework.Executor;

/**
 * @author Ajinkya
 * 
 */
public class Example1 extends Executor {

	/*
	 * Add all your inputs to object array and return the object array
	 * 
	 * @see com.framework.Executable#inputJason()
	 */
	public Object[] inputJason() {
		return new Object[] { 1, 2, 3 };
	}

	/*
	 * Return the expected output of the function which is compared on basis of
	 * equals function. Override equals function if you want to customize
	 * 
	 * @see com.framework.Executable#outputJason()
	 */
	public Object outputJason() {
		return 6;
	}

	/*
	 * This method is used to execute you function inputs are taken from object
	 * array and output of function should be returned
	 * 
	 * @see com.framework.Executable#execute(java.lang.Object[])
	 */
	public Object execute(Object[] obj) {
		return add((Integer) obj[0], (Integer) obj[1], (Integer) obj[2]);
	}

	/*
	 * Your function: Function to add 3 integers
	 */
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	/**
	 * Create a object of you class which should extend Executor class and use the
	 * object to call the runner() method
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Example1 ex = new Example1();
		ex.runner();
	}

}
