package sortingAlgorithm;

public class QuickSort {
	public static void quickSort(int[]arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		quickSort(arr,0,arr.length -1);
	}
	
	private static void quickSort(int[]arr, int low, int high) {
		if(low < high) {
			int pi = partition(arr, low, high); //Find the pivot index
			quickSort(arr, low, pi-1);
			quickSort(arr,pi+1, high);
		}
	}

	private static int partition(int[]arr, int low, int high) {
		int pivot = arr[high]; //choose the right most element as the pivot
		int i = low -1; //Pointer for the greater element
		
		for(int j =low; j<high; j++) {
			if(arr[j] <= pivot) {  //If the current element is smaller than or equal to pivot
				i++;
				swap(arr, i, j) ;//swap element at i and j
			}
		}
		
		swap(arr, i +1, high);  //swap the pivot element with the element at i+1
		return i+1;  //Return the pivot index
		}
	
	private static void swap(int[]arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = {50, 35, 10, 11, 32, 12};
        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

	}


