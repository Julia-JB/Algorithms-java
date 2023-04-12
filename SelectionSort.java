package AlgorithmsProblems;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] numbers = { 23, 16, 18, 3, 90, 37, 10, 0 };
		selectionSortAsc(numbers);
		selectionSortDesc(numbers);

	}

	public static int[] selectionSortAsc(int[] arr) {

		for (int n = 0; n < arr.length - 1; n++) {

			int minIndex = n;

			for (int i = n + 1; i < arr.length; i++) {
				if (arr[i] < arr[minIndex]) {
					minIndex = i;
				}
			}
			int tmp = arr[minIndex];
			arr[minIndex] = arr[n];
			arr[n] = tmp;
		}

		System.out.println(Arrays.toString(arr)); // Output: [0, 3, 10, 16, 18, 23, 37, 90]
		return arr;
	}

	public static int[] selectionSortDesc(int[] arr) {

		for (int n = 0; n < arr.length - 1; n++) {

			int maxIndex = n;

			for (int i = n + 1; i < arr.length; i++) {
				if (arr[i] > arr[maxIndex]) {
					maxIndex = i;
				}
			}
			int tmp = arr[maxIndex];
			arr[maxIndex] = arr[n];
			arr[n] = tmp;
		}

		System.out.println(Arrays.toString(arr)); // Output: [90, 37, 23, 18, 16, 10, 3, 0]
		return arr;
	}

}
