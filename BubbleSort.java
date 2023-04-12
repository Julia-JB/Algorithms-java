package AlgorithmsProblems;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers = { 23, 16, 18, 3, 90, 37, 10, 0 };

		bubbleSortAsc(numbers);
		bubbleSortDesc(numbers);

	}

	public static int[] bubbleSortAsc(int[] arr) {

		for (int n = 0; n < arr.length; n++) {
			for (int i = 1; i < arr.length - n; i++) {

				if (arr[i] < arr[i - 1]) {

					int tmp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr)); // Output: [0, 3, 10, 16, 18, 23, 37, 90]
		return arr;
	}

	public static int[] bubbleSortDesc(int[] arr) {

		for (int n = 0; n < arr.length; n++) {
			for (int i = arr.length - 1; i >= 1; i--) {

				if (arr[i] > arr[i - 1]) {

					int tmp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr)); // Output:[90, 37, 23, 18, 16, 10, 3, 0]
		return arr;
	}

}
