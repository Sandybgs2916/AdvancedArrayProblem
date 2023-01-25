package AdvArrays;

public class floorofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40,50,60,70,80,90,100};
		 int target = 65;
		 int ans = ceiling(arr,target);
		 System.out.println(ans);
	}
		 public static int ceiling(int [] arr, int target) {
		    if(target < arr[0]) {
				 return -1;
			}
			int start = 0; //lowest index
		 int end = arr.length - 1; // highest index
		 while(start <= end) {
			 int mid = (start + end)/2;
			 if(target > arr[mid]) {
				 start = mid + 1;
			 }
			 else if(target < arr[mid]) {
				 end = mid - 1;
			 }
			 else {
				 return mid;
			 }
		 }
		 return end;
	}
}