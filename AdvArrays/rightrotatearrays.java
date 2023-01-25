package AdvArrays;

public class rightrotatearrays {

	public static void main(String[] args) {
		
		  int [] arr = {1,2,3,4,5,6,7};
		 rotate(arr, 2);
		 for(int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }
	}
	public static void rotate(int[]arr, int k) {
		k = k % arr.length; // i.e 2 % 7 = 2
		reverse(arr,0,arr.length-1);
		reverse(arr,0,k-1);
		reverse(arr,k,arr.length-1);
	}
	public static void reverse(int[]arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		} 
	}
}