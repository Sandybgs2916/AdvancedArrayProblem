package AdvArrays;

public class rainwaterharvesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {0,2,1,3,0,1,2,1,2,1};
		rainHarv(arr);
		}
	public static int lMax(int[]arr, int j) {
		int max = arr[j];
		for(int i = j-1; i >= 0; i--) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int rMax(int[]arr, int j) {
		int max = arr[j];
		for(int i = j+1; i <= arr.length-1; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void rainHarv(int[]arr) {
		int ans = 0;
		for(int i = 0; i < arr.length; i++) {
			int l = lMax(arr,i);
			int r = rMax(arr,i);
			int m = Math.min(l, r);
			ans += m-arr[i];
		}
		System.out.println(ans); 
	}
}  