package com.java8.improvements;

/**
 * Default, Defender or Extension Method of Java 8 with Example
 * 
 * Java Program to demonstrate use of default method in Java 8. * You can define
 * non-abstract method by using default keyword, and more * than one default
 * method is permitted, which allows you to ship default skeletal implementation
 * on interface itself.
 * 
 * @see http 
 *      ://javarevisited.blogspot.com.br/2014/07/default-defender-or-extension
 *      -method-of-Java8-example-tutorial.html
 * @author Javin Paul
 *
 */
public class ExtensionMethods {

	public static void main(String args[]) {
		
		// The product sub class is implemented using an anonymous class. The
		// code is quite verbose : 6 lines of code for such a simple
		// multiplication.
		Multiplication product = new Multiplication() {
			@Override
			public int multiply(int x, int y) {
				return x * y;
			}
		};
		int squareOfTwo = product.square(2);
		int cubeOfTwo = product.cube(2);
		System.out.println("Square of Two : " + squareOfTwo);
		System.out.println("Cube of Two : " + cubeOfTwo);

		// You can reduce a lot of boiler plate code by using lambda expression,
		// which is also introduced on Java 8. Since our interface contains only
		// one abstract method and Java's lambda expression is of SAM type
		// (Single Abstract method), we can replace anonymous class
		// implementation with just one line of lambda expression, as shown
		// below :
		Multiplication lambda = (x, y) -> x * y;
		int squareOfThree = lambda.square(3);
		int cubeOfThree = lambda.cube(3);
		System.out.println("Square of Three : " + squareOfThree);
		System.out.println("Cube of Three : " + cubeOfThree);
	}

}

/**
 * 
 * Java 8 enables us to add non-abstract method implementations to interfaces by
 * utilizing the default keyword. This feature is also known as Extension
 * Methods. Here is our first example:
 *
 * Besides the abstract method multiply() the interface Multiplication also
 * defines the default method square(). Any concrete classes of Multiplication
 * interface only have to implement the abstract method multiply(). The default
 * method square() method can be used directly.
 * 
 */
interface Multiplication {
	int multiply(int a, int b);

	default int square(int a) {
		return multiply(a, a);
	}

	default int cube(int a) {
		return multiply(multiply(a, a), a);
	}
}
