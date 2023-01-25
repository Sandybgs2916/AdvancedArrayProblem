package AdvArrays;

public class sumofoneDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,5,8,9,7};
		int sum = 0;
		System.out.println("The original array is: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	    for(int i = 0; i < arr.length; i++) {
	    	sum = sum + arr[i];
	    }
	    	System.out.println("The Sum of array is: " + sum); 
	    }
	}