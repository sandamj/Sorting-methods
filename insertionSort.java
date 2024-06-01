package sortingAlgorithm;
import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int number;
		System.out.println("Enter array size: ");
		number = in.nextInt();
		int arr[] = new int[number];
		System.out.println("Enter array values: ");
		for(int i=0; i<number; i++) {
			arr[i] = in.nextInt();
		}
		
		int length = arr.length;
		System.out.print("Unsorted array: ");
		 for(int i=0; i<length; i++)
			 System.out.print(arr[i]+ " ");
		 
		 
		for(int i=1; i<length; i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] >key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			
			arr[j+1] = key;
			
		}
		
		System.out.println();
		 System.out.print("Sorted array: ");
		 for(int i=0; i<length; i++)
			 System.out.print(arr[i]+ " ");

	}

}
