package sortingAlgorithm;
import java.util.Scanner;

public class bubbleSort {

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
			System.out.print(arr[i] + " ");
		
		for(int i=0; i<length; i++) {
			for(int j=1; j<length-i; j++) {
				if(arr[j-1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.print("Sorted array: ");
		for(int i=0; i<length; i++)
			System.out.print(arr[i] + " ");

	}

}
