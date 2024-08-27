package Arrayprograms;


public class FindFreqOfElements {
	public static void main(String[]args) {
		int[] arr = {1,2,1,3,8,2,2,2};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		int[]freq= new int [max+1];
		for(int j : arr) {
			freq[j]++;
		}
		
		for(int i=0;i<=max;i++) {
			if(freq[i]>0) {
				System.out.println(i+" Frequency: "+freq[i]);
			}
		}
		
		
	}
}
			
			

