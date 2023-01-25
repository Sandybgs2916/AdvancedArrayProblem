package AdvArrays;

import java.util.Scanner;

public class leftrotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5};
		int [] ansarr = new int [arr.length]; // used to store array after rotation
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Rotations : ");
		int noofRotations = sc.nextInt();
		int rotationPoint = noofRotations;
		int i = 0; // for output array
		while(rotationPoint < arr.length) {
			ansarr[i] = arr[rotationPoint]; // element storing in array with the index we want to rotate
			i++;
			rotationPoint++;
		}
		rotationPoint = 0; // storing element before rotating point
		while(rotationPoint < noofRotations) {
			ansarr[i] = arr[rotationPoint];
			i++;
			rotationPoint++;
		}
		System.out.println("Output Array Is : ");
		for(int arrelement : ansarr) {
			System.out.print(arrelement + " ");
		}
	}
}