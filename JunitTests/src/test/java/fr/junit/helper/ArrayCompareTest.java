package fr.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	// Arrays.sort

	@Test
	public void testArraySort_RandomArray() {
		int[] numbers = { 12, 2, 4, 1 };
		int[] expected = { 1, 2, 4, 12 };
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testArraySort_NullArray() {
		int[] numbers = {};
		Arrays.sort(numbers);
	}

	@Test(timeout = 100)
	public void testSortçPerformance() {
		int array[] = { 12, 23, 4 };
		for (int i = 0; i <= 1000000; i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}
}
