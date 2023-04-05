package AlgorithmsProblems;

import java.util.Arrays;

public class SelectionSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {23, 16, 18, 3, 90, 37, 10, 0};
		selectionSorter(numbers);

	}
	
	public static void selectionSorter(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        
        System.out.println(Arrays.toString(arr));
    }

}
