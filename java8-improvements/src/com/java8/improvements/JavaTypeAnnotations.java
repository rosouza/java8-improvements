package com.java8.improvements;

import javax.annotation.Nonnull;

/**
 * Annotations are a familiar subject and we all used them, especially in the
 * Java EE environment, but we could only apply annotations on type declarations
 * (classes, methods or variable definitions). Starting with Java SE8, we can
 * apply annotations also to any type use, which means that anywhere we use a
 * type we can add an annotation to that type. The idea of this addition is to
 * be able to detect more errors at compile-time versus runtime, with a little
 * help of the compiler and type checkers.
 * 
 * Unfortunately, Java SE8 doesn’t come with a type checking framework, but it
 * does allow us to use a type checking framework that is implemented as one or
 * pluggable modules that are used in conjunction with the Java compiler. An
 * example of such framework is The Checker Framework created by the University
 * of Washington, which allows developers to detect and prevent errors in Java
 * programs. You need to download the core libraries and add them to your
 * project first. For an example to this, we need to define two objects first.
 * 
 * @see http://bravenewtalent.curatasite.com/articles/share/455996/
 * @author Constantin Marian Alin
 *
 */
public class JavaTypeAnnotations {

	public static void main(String[] args) {

		JavaTypeAnnotations.getName(null);

	}

	@Nonnull
	public static String getName(@Nonnull String teste) {
		return null;
	}

}
