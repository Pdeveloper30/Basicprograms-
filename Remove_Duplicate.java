package Task1;

import java.util.Arrays;

public class Remove_Duplicate {

	public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 3, 3, 4, 5};
        int[] resultArray = removeDuplicates(inputArray);
        
        System.out.print("Input Array: ");
        printArray(inputArray);
        
        System.out.print("Array after removing duplicates: ");
        printArray(resultArray);
    }

    public static int[] removeDuplicates(int[] arr) {
        // Sorting the array to bring duplicate elements together
        Arrays.sort(arr);

        // Finding number of unique elements
        int uniqueCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                uniqueCount++;
            }
        }

        // Creating a new array to store unique elements
        int[] resultArray = new int[uniqueCount];
        resultArray[0] = arr[0];
        int j = 1;

        // Storing unique elements in the new array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                resultArray[j] = arr[i];
                j++;
            }
        }

        return resultArray;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
