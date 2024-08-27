package Arrayprograms;

public class ElementAToddposiotion {
	public static void main(String[]args) {
		int[]arr= {0,1,3,3,2,5,3,7,6,9};
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
