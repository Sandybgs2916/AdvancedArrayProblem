package AdvArrays;
import java.util.*;

public class searchinsorted2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of elements");
		int n = sc.nextInt();
		// int [] [] arr = {{1,3,8,9}, {2,7,9,10}, {11,13,15,17}, {14,16,18,20}};
		int [][] arr = new int[n][n];
		System.out.println("enter elements");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter number to be searched");
		int x = sc.nextInt();
		int i = 0;
		int j = arr[0].length-1;
		while(i < arr.length && j >= 0) {
			if(x == arr[i][j]) {
				System.out.println("x found at:" +i +" " +j);
				return;
			}
			else if(arr[i][j] < x) {
				i++;
			}
			else {
				j--;
			}
		}
		System.out.println("not found");
	}
} 	