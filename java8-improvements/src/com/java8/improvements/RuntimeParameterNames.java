package com.java8.improvements;

import java.lang.reflect.Parameter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Another addition in Java SE8 is the possibility to access parameter names at
 * runtime. Prior to Java SE8, we had access to the types of the parameters that
 * are being passed, but we couldn't get the names and in certain situations it
 * is useful to have a name-type pair associated with your parameters. For
 * example, we have the below class.
 * 
 * @see http://bravenewtalent.curatasite.com/articles/share/455996/
 * @author Constantin Marian Alin
 *
 */
public class RuntimeParameterNames {

	private final String name;
	private final String color;
	private final String brand;

	public RuntimeParameterNames(String name, String color, String brand) {
		this.name = name;
		this.color = color;
		this.brand = brand;
	}

	public static void main(String[] args) {
		Parameter[] carsParams;
		try {
			carsParams = RuntimeParameterNames.class.getConstructor(String.class, String.class, String.class)
					.getParameters();

			for (Parameter param : carsParams) {
				if (param.isNamePresent()) {
					System.out.println("Parameter name : " + param.getName());
				}
			}

		} catch (NoSuchMethodException | SecurityException ex) {
			Logger.getLogger(RuntimeParameterNames.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}