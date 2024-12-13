//chapter: Basic sorting algorithm 
/*2:NB:42: Bubble sort: */

/* 
import java.util.*; 

public class BasicSorting{
	public static void bubbleSort(int arr[]){
		for(int turns = 0;  turns<arr.length-1; turns++){
			for(int j = 0; j<arr.length-1-turns; j++){
				if(arr[j] > arr[j+1]){
					// swap 
					int temp = arr[j]; 
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
				}
			}
		} 
	} 
	
	public static void printArr(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" "); 
		} 
		System.out.println(); 
	} 
	
	public static void main(String[] args){
		int arr[] = {5, 4, 1, 3, 2}; 
		
		bubbleSort(arr);
		printArr(arr); 
	}
} 
	*/ 


//2: Selection Sort: n = 5: 

/*
public class BasicSorting {
		public static void selectionSort(int arr[]){
			for(int i=0;  i<arr.length-1;  i++){
				int minPos = i; 
				for(int j= i+1; j<arr.length; j++){
					if(arr[minPos] > arr[j]){
						minPos = j; 
					}
				}
				int temp = arr[minPos]; 
				arr[minPos] = arr[i]; 
				arr[i] = temp; 
			}
		}
		public static void printArr(int arr[]){
			for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]+" "); 
			} 
			System.out.println(); 
		} 
	public static void main(String[] args){
		int arr[] = {5, 4, 1, 3, 2};

		selectionSort(arr);
		printArr(arr);
	}	
}
*/ 

//Q.3: insertion sort: cards game example(Patte): pick smallest at the front

/**
 * BasicSorting
 *//* 
public class BasicSorting {

	public static void insertionSort(int arr[]){
		for(int i=1; i<arr.length; i++){
			int curr = arr[i]; 
			int prev = i-1; 

			// finding out the correct pos to insert
			while(prev >= 0 && arr[prev] > curr){
				arr[prev+1] = arr[prev]; 
				prev--; 
			}
			// insertion sort 
			arr[prev + 1] = curr; 

		}
	}
	public static void PrintArr(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		int arr[] = {5, 4, 1, 3, 2}; 

		insertionSort(arr);
		PrintArr(arr);
	}
}
*/ 
// counting Sort: count the number frequency & and arrange that in sorted 

/* 
public class BasicSorting {

	public static void countingSort(int arr[]){
		int largest = Integer.MIN_VALUE;

		for(int i = 0; i<arr.length; i++){
			largest = Math.max(largest, arr[i]); 
		}

		int count[] = new int[largest + 1]; 
		for(int i=0; i<arr.length; i++){
			count[arr[i]]++; 
		}

		// sorting on freq array
		int j = 0; 
		for(int i=0; i<count.length; i++ ){
			while(count[i] > 0){
				arr[j] = i; 
				j++; 
				count[i]--;  // freq decrease
			}
		}
	}


	public static void PrintArr(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		int arr[] = {1, 4, 1, 3, 2, 4, 3, 7}; 

		countingSort(arr);
		PrintArr(arr);
	}
}
*/ 

/*******************************************************************/
// Assignments: Questions: learn algorithms try on this array 
// arr [] = [3, 6, 2, 1, 8, 7, 4, 5, 3, 1]

// a: Bubble Sort: 
/* 
public class BasicSorting {

	public static void bubbleSorting(int arr[]){
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr.length-1-i; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp;
				}
			}
		}
	}
    
	public static void printArr(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.println("bubble sort: "+arr[i]+" ");
		}
	}
	public static void main(String[] args){
		int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1}; 

		bubbleSorting(arr); 
		printArr(arr);


	}
}
*/ 

// b: Selection Sort: 
/* 
public class BasicSorting {

	public static void selectionSorting(int arr[]){
		for(int i = 0; i<arr.length; i++){

			int minPos = i; 
			for(int j = i+1; j<arr.length; j++){
				if(arr[minPos] > arr[j]){
					minPos = j; 
				}

				int temp = arr[minPos]; 
				arr[minPos] = arr[i]; 
				arr[i] = temp;
			}
		}
    }
	public static void printArr(int arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.println("Selection sort: "+arr[i]+" ");
		}
	}
	public static void main(String[] args){
		int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1}; 

		selectionSorting(arr); 
		printArr(arr);
	}
}

*/ 
// c.  Selection Sort: 

