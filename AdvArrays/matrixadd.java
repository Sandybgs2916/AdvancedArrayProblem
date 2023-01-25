package AdvArrays;

public class matrixadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int a[][] = {{1,3,5}, {2,4,3}, {7,8,9}};
		int b[][] = {{4,5,8}, {9,7,3}, {5,8,3}};
		// create another matrix for store add
		int c [][] = new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				c[i][j]=a[i][j]+b[i][j];
				// c[i][j]=a[i][j]-b[i][j]; // for matrix subs
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
} 