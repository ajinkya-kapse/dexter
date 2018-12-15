/**
 * com.test
 * Test.java
 * 8:56:31 PM||14-Dec-2018
 * By:Ajinkya
 */
package com.example;

import com.framework.Executor;

/**
 * @author Ajinkya
 * 
 */
public class Example2 extends Executor {

	/**
	 * Create a object of you class which should extend Executor class and use the
	 * object to call the runner() method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Example2 ex = new Example2();
		ex.runner();

	}

	/*
	 * Add all your inputs to object array and return the object array
	 * 
	 * @see com.framework.Executable#inputJason()
	 */
	public Object[] inputJason() {
		Student s1 = new Student(1, "Ram", 50);
		Student s2 = new Student(2, "Sam", 51);

		Object[] o = { s1, s2 };
		return o;
	}

	/*
	 * Your function: Function to compare two student and return the student object
	 * with more marks or null if marks are equal
	 */
	public Student compare(Student s1, Student s2) {
		if (s1.marks > s2.marks) {
			return s1;
		} else if (s1.marks < s2.marks) {
			return s2;
		} else
			return null;

	}

	/*
	 * Return the expected output of the function which is compared on basis of
	 * equals function. Override equals function if you want to customize
	 * 
	 * @see com.framework.Executable#outputJason()
	 */
	public Object outputJason() {
		Student s2 = new Student(2, "Sam", 51);
		return s2;
	}

	/*
	 * This method is used to execute you function inputs are taken from object
	 * array and output of function should be returned
	 * 
	 * @see com.framework.Executable#execute(java.lang.Object[])
	 */
	public Object execute(Object[] o) {

		return compare((Student) o[0], (Student) o[1]);
	}

}

class Student {
	public int id;
	public String name;
	public int marks;

	public String toStrings() {
		return id + ":" + name + ":" + marks;

	}

	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (this.id == s.id)
			return true;
		return super.equals(obj);
	}
}
