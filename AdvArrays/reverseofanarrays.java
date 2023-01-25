package AdvArrays;

public class reverseofanarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,5,8,9,7};
		System.out.println("The original array is: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	    System.out.println("The reverse array is: ");
	    for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
	    }
	}
}