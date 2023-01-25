package AdvArrays;

import java.util.Scanner;

public class diagonaltraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int [][] arr = new int[n][n];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		for(int g = 0; g < arr.length; g++) { // difference of i and j of every diagonal
			for(int i = 0, j = g; j < arr.length; i++, j++) { // every diagonal i start with 0 
				System.out.println(arr[i][j]);               // and j start with g
			}
		}
	}
}  