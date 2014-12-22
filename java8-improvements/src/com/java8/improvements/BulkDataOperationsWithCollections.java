package com.java8.improvements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Java SE8 added two packages related to bulk data operations for Collections,
 * the java.util.function package, and the java.util.stream. A stream is like an
 * iterator, but with a lot of extra functionality. Now, when you want to
 * process a collection, you can use streams.
 * 
 * Another good thing about streams is that they were implemented in such a way
 * that they can be used either serial, or either parallel, and this is where
 * the power of streams with lambdas shows up. Because of this, developers can
 * stop writing java code specifically serial or specifically parallel and write
 * code that can simply be either by just changing the way streams are created.
 * Also, streams use lazy evaluation and they are not actually reading all the
 * data and methods like getFirst()can end the stream. A few examples of streams
 * and lambdas are shown below.
 * 
 * @see http://bravenewtalent.curatasite.com/articles/share/455996/
 * @author Constantin Marian Alin
 *
 */
public class BulkDataOperationsWithCollections {

	public static void main(String[] args) {

		List<String> players = new ArrayList<>(Arrays.asList("Rafael Nadal", "Novak Djokovic", "David Ferrer",
				"Andy Murray", "Juan Martin Del Potro", "Roger Federer"));

		System.out.println(" *************** Looping before Java SE8 *************** ");
		for (String o : players) {
			System.out.println(o);
		}

		System.out.println(" *************** Loop using functional operation *************** ");
		players.stream().forEach((o) -> {
			System.out.println(o);
		});

		System.out.println(" *************** Loop using member reference *************** ");
		players.stream().forEach(System.out::println);

		System.out.println(" *************** Loop using explicit parameter types ******************");
		players.stream().forEach((String o) -> {
			System.out.println(o);
		});

		System.out.println(" *************** Loop using anonymous innerclass *************** ");
		players.stream().forEach(new Consumer<String>() {
			@Override
			public void accept(String o) {
				System.out.println(o);
			}
		});

	}
}
