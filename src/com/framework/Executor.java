/**
 * com.framework
 * Executor.java
 * 12:46:54 AM||15-Dec-2018
 * By:Ajinkya
 */
package com.framework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.google.gson.Gson;

/**
 * @author Ajinkya
 *
 */
public abstract class Executor implements Executable {

	public void runner() {
		Gson g = new Gson();
		System.out.println("Inputs:");
		Object[] o = this.inputJason();
		for (Object object : o) {
			System.out.println(g.toJson(object));
		}

		System.out.println("=========================================");
		System.out.println("execute:");
		Class<? extends Executor> c = this.getClass();
		try {
			Method m = c.getMethod("execute", o.getClass());
			Object obj = m.invoke(this, new Object[] { o });
			System.out.println("=========================================");
			System.out.println("Outputs:");
			System.out.println(g.toJson(obj));
			System.out.println("=========================================");
			System.out.println("Result:");
			if (obj.equals(this.outputJason())) {
				System.out.println("Test Passed");
			} else {
				System.out.println("Test Failed");
			}

		} catch (IllegalAccessException e) {

			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			System.out.println("Input mismatch!!");
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
