package sortingAlgorithm;

public class modifiedBubbleSort {

	public static void main(String[] args) {
		int [] arr = {1, 6, 7, 12, 11, 13};
		int size = arr.length;
		
		
		
		for(int i=0; i<(size-1); i++) {
			boolean swapp = false;
			for(int j=0; j<(size- i-1); j++) {
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					
					swapp = true;
				}
			}
			
			if(!swapp)
				break;
		}
		
		System.out.println("Sorted array: ");
		for (int i : arr) {
            System.out.print(i + " ");
	}

}
}
