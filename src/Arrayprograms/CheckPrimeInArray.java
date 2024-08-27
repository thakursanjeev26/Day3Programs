package Arrayprograms;

public class CheckPrimeInArray {
	static boolean Isprime(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			boolean isprime=false;
			for(int j=2;j<Math.sqrt(i);j++) {
				
				if(arr[i]%arr[j]==0) {
					
				}
			}
			
		}
	}
	
	public static void main(String args[]) {
		int[]arr= {1,2,3,4,5,6,7,8,9};
		Isprime(arr);
	}
}
