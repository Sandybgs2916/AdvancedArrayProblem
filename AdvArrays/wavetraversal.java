package AdvArrays;

import java.util.Scanner;

public class wavetraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter rows and columns:");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][]arr = new int[n][m];
		System.out.println("Enter elements:");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int j = 0; j <arr[0].length; j++) {
			if(j % 2 == 0) {
				// in even column rows increases
				for(int i = 0; i < arr.length; i++) {
				System.out.println(arr[i][j]);
			}
		}
			// in odd column rows decreases
			else {
				for(int i = arr.length-1; i >= 0; i--) {
					System.out.println(arr[i][j]);
				}
			}
	}  
}
}   