package Arrayprograms;

public class FindMinInArray {
	public static void main(String[]args) {
		int[] arr= {1,2,5,7,8,3,4,11,12,23,-1};
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}System.out.println("Minimum element is array is : "+min);
	}
}
