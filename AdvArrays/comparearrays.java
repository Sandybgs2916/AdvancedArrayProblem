package AdvArrays;
import java.util.*;

public class comparearrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2, 3, 4, 5};
		int arr2[] = {2, 3, 4, 5};
		if(Arrays.equals(arr1,arr2)) {
			System.out.println("Same Arrays");
		}
		// method2 if(arr1 == arr2){ 
		else {
			System.out.println("Not Same Arrays");
		}
	}
}