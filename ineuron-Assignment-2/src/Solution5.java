
public class Solution5 {
	
	static void swap(int arr[], int min, int i) {
		int tmp = arr[i];
		arr[i] = arr[min];
		arr[min] = tmp;
	}

	public static void main(String[] args) {
		// Question:-5. WAP to sort an array using Selection Sort Algorithm.
		
		int[] arr = { 4, 1, 9, 2, 3, 6 };
		
		int[] arr1 = { 1, 2, 3, 5, 6, 5, 8, 9, 11, 12, 5 };
		
		int[] arr2 = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
		
		int[] arr3 = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		
		int[] arr4 = { 5, 8, 6, 7, 9, 10, 11, 6, 8, 10 };
		
		int len = arr4.length;
		
		// 1.
//		for(int i = 0; i < len - 1; i++) {
//			int tmp = arr4[i], swap, index = 0;
//			boolean flag = false;
//			
//			for(int j = i + 1; j < len; j++) {
//				if(tmp > arr4[j]) {
//					tmp = arr4[j];
//					index = j;
//					flag = true;
//				}
//			}
//			if(flag) {
//				swap = arr4[i];
//				arr4[i] = tmp;
//				arr4[index] = swap;
//			}
//		}
		
		// 2.
		for(int i = 0; i < len - 1; i++) {
			int min = i, swap;
			for(int j = i + 1; j < len; j++) {
				if(arr4[min] > arr4[j]) {
					min = j;
				}
			}
			if(min != i) {
//				swap = arr4[i];
//				arr4[i] = arr4[min];
//				arr4[min] = swap;
				swap(arr4, min, i);
			}
		}
		
		
		
		for(int elem: arr4)
			System.out.print(elem + " ");

	}

}
