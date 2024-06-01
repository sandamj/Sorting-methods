package sortingAlgorithm;
import java.util.Scanner;

public class selectionSort {

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
		System.out.println("Unsorted array: ");
		for(int i=0; i<length; i++)
			System.out.print(arr[i] + " ");
		
		for(int i=0; i<length-1; i++) {
			int minValue = i;
			for(int j=i+1; j<length; j++) {
				if(arr[minValue]>arr[j])
				minValue =j;
			}
			
			int temp = arr[minValue];
			arr[minValue] = arr[i];
			arr[i] = temp;
			
		}
		
		System.out.println();
		System.out.println("Sorted array: ");
		for(int i=0; i<length; i++)
			System.out.print(arr[i] + " ");
			
	}

}
