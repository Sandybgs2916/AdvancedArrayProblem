 package AdvArrays;

import java.util.*;

public class spiraltraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int [][] arr = new int[n][m];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		int minr = 0;
		int minc = 0;
		int maxr = arr.length-1;
		int maxc = arr[0].length-1;
		int count = 0;
		// count is used so that after printing whole output it won't be repeated
		int tele = n * m; // total element
		while(count <= tele) {
			// left wall
			for(int i = minr, j = minc; i <= maxr && count < tele; i++) {
				System.out.println(arr[i][j]);
				count++;
			}
			minc++;
			// bottom wall
			for(int i = maxr, j = minc; j <= maxc && count < tele; j++) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxr--;
			// right wall
			for(int i = maxr, j = maxc; i >= minr && count < tele; i--) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxc--;
			// top wall
			for(int i = minr, j = maxc; j >= minc && count < tele; j--) {
				System.out.println(arr[i][j]);
				count++;
			}
			minr++; // to start new pattern
	}
}
}  