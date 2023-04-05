package AlgorithmsProblems;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] numbers = {23, 16, 18, 3, 90, 37, 10, 0};
		bubbleSort(numbers);
	}
	
	public static void bubbleSort(int[] arr) {
		
		for (int n = 0; n < arr.length; n++) {
			for (int i = 1; i < arr.length - n; i++) {
				
				if (arr[i] < arr[i-1]) {
					int tmp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
