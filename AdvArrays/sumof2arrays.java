package AdvArrays;

import java.util.Scanner;

public class sumof2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int []arr1 = new int[n1];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		int n2 = sc.nextInt();
		int []arr2 = new int[n2];
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
	}
		int[] ans = new int [n1>n2? n1:n2]; // it means if n1>n2 take n1 if not take n2 // ternary operator
		int c = 0;
		int i = arr1.length-1;
		int j = arr2.length-1;
		int k = ans.length-1;
		while(k >= 0) {
			    int sum = 0;
			    if(i >= 0) {    // index of arr1
			    	sum += arr1[i];
			    }
			    if(j >= 0) {    // index of arr2
			    	sum += arr2[j];
			    }
			    sum += c;
			    c = sum / 10;
			    sum = sum % 10;
			    ans[k] = sum;
			    i--;
			    j--;
			    k--;
		}
		if(c > 0) {
			System.out.println(c);
		}
		for(int x : ans) {
			System.out.println(x);	    
		}  
}
} 