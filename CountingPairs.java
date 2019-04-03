package com.collection1.Vector;

public class CountingPairs {
	public static int countPairs(int[] countArray, int k){
		int count =0;
		
		for (int i = 1; i < countArray.length-1; i++) {
			if(countArray[i-1] <= countArray[i] && countArray[i-1]+k == countArray[i])
			{
				count++;
			}
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {
		int[] array = new int[]{1, 1, 1, 2, 2, 3, 3};
		int k = 1;
		int noOfPairsis = countPairs(array, k);
		System.out.println(noOfPairsis);
		
	}

}
