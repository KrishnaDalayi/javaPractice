package sortingAlgorithmsPractice;



public class BubbleSort {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr = {5,3,7,2,1,4};
         bubbleSort(arr);
         for(int i: arr)
         System.out.println("Bubble Sort: " +i) ;
	}
	
	static void bubbleSort(int[] arr){
		int n = arr.length;
		int temp=0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n-1-i; j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	

}
