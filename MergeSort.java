package sortingAlgorithm;

public class MergeSort {
	
	public static void mergeSort(int[]arr) {
		if(arr == null || arr.length<=1) {
			return; //Base case:array is already sorted or empty
		}
		
		int[] temp = new int[arr.length];
		mergeSort(arr,temp,0,arr.length-1);
	}
	
	private static void mergeSort(int[]arr, int[]temp, int lb,int ub) {
		if(lb >= ub) {
			return; //Base case
		}
		int middle = (lb + ub)/2;
		mergeSort(arr,temp,lb,middle); //sort left half
		mergeSort(arr,temp,middle+1,ub); //sort right half
		merge(arr,temp,lb,ub); //Merge sorted halves		
	}
	
	public static void merge(int[]arr,int[] temp,int lb,int ub) {
		int leftEnd = (lb + ub) / 2;
        int rightStart = leftEnd + 1;
        int size = ub - lb + 1;

        int left = lb;
        int right = rightStart;
        int index = lb;

        // Merge two sorted arrays into temp array
        while (left <= leftEnd && right <= ub) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        // Copy remaining elements from left sub array
        while (left <= leftEnd) {
            temp[index++] = arr[left++];
        }

        // Copy remaining elements from right sub array
        while (right <= ub) {
            temp[index++] = arr[right++];
        }

        // Copy sorted elements from temp array back to original array
        for (int i = lb; i <= ub; i++) {
            arr[i] = temp[i];
        }
	}
	public static void main(String[] args) {
		int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }

	}

}
