package AdvArrays;

import java.util.Scanner;

public class sqrtusinbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		System.out.println(sqrt(n));
	}
	public static int sqrt (int n) {
		int start = 1;
		int end = n;
		int ans = 0;
		while(start <= end) {   
			int mid = (start + end)/2;  
			if(! possible(mid,n)) { // i.e if mid * mid > n
				end = mid - 1;
			}
			else {
				ans = mid;
				start = mid + 1; // i.e mid * mid <= n
			}
		}
		return ans;
	}
	public static boolean possible(int mid, int n) {
	    return mid * mid <= n;
	}
}