package Arrayprograms;

public class DublicateElementsInArray {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 2, 1};
        boolean isFound = false;

        System.out.println("Duplicate elements in the array are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    isFound = true;
                    break;
                }
            }
        }
        
        if (!isFound) {
            System.out.println("No duplicates found");
        }
    }
	}




