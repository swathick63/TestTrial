package com.collection1.Vector;

import java.util.Arrays;

public class MinimumUniqueArraySum {
	
	public static int getMinimumUniqueSum(int[] array){
		int increment =0;
		
		int sum = 0;
		Arrays.sort(array);
		for (int i = 1; i < array.length; i++) {
		
		while (array[i-1] == array[i]) {
			increment = Math.abs(array[i-1]-(i+1));
			array[i-1] = array[i-1]+increment;
			Arrays.sort(array);
		}
		
		}

		for (int element : array) {
			System.out.println(element);
			sum = sum + element;
		}
		System.out.println("Th e sum is"+sum);
		return sum;
		
	}
	
	public static void main(String[] args) {
		int[] array = new int[]{3, 2, 2, 1, 2, 7};
		getMinimumUniqueSum(array);
	}

}
