package Arrayprograms;

public class ReverseAray {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        // Print the original array
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i] + " ");
        }
        System.out.println();  // Move to the next line after printing the array

        // Reverse the array
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

