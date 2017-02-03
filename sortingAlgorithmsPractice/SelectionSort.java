package sortingAlgorithmsPractice;



public class SelectionSort {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr = {5,3,7,2,1,4};
         selectionSort(arr);
         for(int i: arr)
         System.out.println("Bubble Sort: " +i) ;
	}
	
	static void selectionSort(int[] arr){
		int n = arr.length;
		for(int i=0; i<n; i++){
			
			int min = arr[i];
			int minIndex = i;
			
			for(int j=i+1; j<n; j++){
				if(arr[j] < min){
				 min=arr[j];
				 minIndex = j;
				}
			}
			arr[minIndex] = arr[i];
			arr[i] = min;
		}
	}
	

}
