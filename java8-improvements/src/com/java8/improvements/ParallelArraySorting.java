package com.java8.improvements;

import java.util.Arrays;
import java.util.Collections;

/**
 * Since Java SE7 has added the Fork/Join framework for lightweight data
 * parallelism, developers around the world have implemented their own
 * algorithms in order to fulfill common parallel tasks like sorting. In order
 * to help developers, Java SE8 has added some more utility methods to the
 * java.util.Arrays class, which now has a parallelSort() method based on
 * multiple signatures for different primitives.
 * 
 * Based on the idea of Doug Lea's parallel-array implementation and built on
 * top of the Fork/Join framework, the parallelSort() method is designed to
 * improve performance with over 30% on sequential sorts for dual-core systems.
 * A minus to this parallel sort is the fact that you need a memory working
 * space at the same size as the array to be sorted. This means that if you are
 * trying to sort a very big array, it is being held in memory, and then you
 * need the same space in memory again in order to hold the working data as it
 * is sorted. A few examples of parallel sorting are shown below.
 * 
 * @see http://bravenewtalent.curatasite.com/articles/share/455996/
 * @author Constantin Marian Alin
 *
 */
public class ParallelArraySorting {

	public static void main(String[] args) {
		Integer[] array = { 44, 84, 2, 68, 9, 0, 32, 8, 35, 86, 33, 25, 55, 5, 66 };

		System.out.println(" ************ Sort the first 10 positions ascending ************ ");
		Arrays.parallelSort(array, 0, 10);

		System.out.println(" ************  Sort the last 10 positions descending  ************ ");
		Arrays.parallelSort(array, array.length - 10, array.length, Collections.reverseOrder());
		System.out.println(array);

		System.out.println(" ************  Sort array ascending  ************ ");
		Arrays.parallelSort(array);
		System.out.println(array);

		System.out.println(" ************  Sort array descending  ************ ");
		Arrays.parallelSort(array, Collections.reverseOrder());
		System.out.println(array);
	}
}
