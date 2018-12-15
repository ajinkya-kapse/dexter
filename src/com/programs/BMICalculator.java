/**
 * com.programs
 * BMICalculator.java
 * 7:14:11 PM||15-Dec-2018
 * By:Ajinkya
 */
package com.programs;

import com.framework.Executor;

/**
 * @author Ajinkya
 *
 */
public class BMICalculator extends Executor {
	/*
	 * Function to calculate BMI inputs- weight in kg, height in meters
	 */
	public float calculateBMI(float weight, float height) {
		return (weight) / (height * height);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.framework.Executable#inputJason()
	 */
	@Override
	public Object[] inputJason() {
		return new Object[] { 60f, 1.8f };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.framework.Executable#outputJason()
	 */
	@Override
	public Object outputJason() {
		float f = (float) ((60f) / (1.8f * 1.8f));
		return f;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.framework.Executable#execute(java.lang.Object[])
	 */
	@Override
	public Object execute(Object[] obj) {
		return calculateBMI((float) obj[0], (float) obj[1]);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Executor e = new BMICalculator();
		e.runner();

	}

}
