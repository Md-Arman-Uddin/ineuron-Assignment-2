
public class Solution3 {
	
	static void swap(int arr[], int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

	public static void main(String[] args) {
		// Question:-3. WAP to sort an array using Bubble Sort Algorithm.
		
		int[] arr = { 4, 3, 7, 1, 5 };
		
		int[] arr1 = { 4, 1, 9, 2, 3, 6 };
		
		int[] arr2 = { 1, 2, 3, 5, 6, 5, 8, 9, 11, 12, 5 };
		
		int[] arr3 = { 0, 4, 3, 2, 7, 8, 2, 3, 1 };
		
		int[] arr4 = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };
		
		int[] arr5 = { 5, 8, 6, 7, 9, 10, 11, 6, 8, 10 };
		
		int len = arr5.length;
		
		for(int i = 0; i < len - 1; i++) {
			boolean flag = false;
			for(int j = 0; j < len - i - 1; j++) {
				if(arr5[j + 1] < arr5[j]) {
					flag = true;
					swap(arr5, j + 1, j);
				}
			}
			if(!flag)
				break;
		}
		
		for(int elem: arr5)
			System.out.print(elem + " ");

	}

}
