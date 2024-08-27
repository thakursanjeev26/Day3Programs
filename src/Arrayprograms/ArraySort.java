package Arrayprograms;

public class ArraySort {
	 
	public static void bubbleSort(int[] arr) {
	        int n = arr.length;
	        boolean swapped;
	        
	        for (int i = 0; i < n - 1; i++) {
	            swapped = false;
	            for (int j = 0; j < n - 1 - i; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                    swapped = true;
	                }
	            }
	            if (!swapped) {
	                break;
	            }
	        }
	    }
	
	
	
	public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2, 7, 6, 4};

        System.out.print("Original array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();  //
 
        bubbleSort(arr);

        
        System.out.print("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

  
}

