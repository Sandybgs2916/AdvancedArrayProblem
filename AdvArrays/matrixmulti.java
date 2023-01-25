package AdvArrays;

import java.util.Scanner;

public class matrixmulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		int [][] m1 = new int[r1][c1];
		for(int i = 0; i < m1.length; i++) {
			for(int j = 0; j < m1.length; j++) {
				m1[i][j] = sc.nextInt();
			}
		}
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		int [][] m2 = new int[r2][c2];
		for(int i = 0; i < m2.length; i++) {
			for(int j = 0; j < m2.length; j++) {
				m2[i][j] = sc.nextInt();
	}
}
		if(c1 != r2) {
			System.out.println("invalid matrix");
		}
		int[][] prd = new int[r1][c2];
		for(int i = 0; i < prd.length; i++) {
			for(int j = 0; j < prd[0].length; j++) {
				for(int k = 0; k < c1; k++) {
					prd[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		for(int i = 0; i < prd.length; i++) {
			for(int j = 0; j < prd[0].length; j++) {
				System.out.print(prd[i][j] + " ");
		}
			System.out.println();
}
	}
}