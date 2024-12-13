//24:NB: Devide And Conquer: 

// Question 1: Merge Sort 
/* 
public class Devide_And_Conquer {

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");  
        }
        System.out.println();
    } 

    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return; 
        }

        //kaam 
        int mid = si + (ei - si)/2; // si + ei / 2
        mergeSort(arr, si, mid);  // left part
        mergeSort(arr,mid+1, ei); // right part//
        
        merge(arr, si, mid, ei);
    }

    public static void merge (int arr[], int si, int mid, int ei){
        // left(0, 3)  = 4 right(4, 6)=3 -> 6-0+1
        int temp[] = new int [ei-si+1]; //6-0+1
        int i  = si; // iterator for left part
        int j = mid+1; // iterator for right part 
        int k = 0; // iterator for temp arr; 

        //*Merge the two parts into temp[]
        while (i <= mid && j <= ei) {
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++]; 
            } else {
                temp[k++] = arr[j++]; 
            }
        }

        //copy remaining elements of the left part (if any) left part
        while(i <= mid){
            temp[k++] = arr[i++]; 
        }

        //right part 
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //Copy the sorted temp array back to the original array
        
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k]; 
        }
    }

    public static void main(String[] args){
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1); 

        printArr(arr);
    }
}
    */

// Question 2: Quick Sort : 
/* 
public class Devide_And_Conquer {
    public static void quickSort(int arr[], int si, int ei){
       
       if(si >= ei){
         return; 
       } 
    
       //last element 
       int pIdx =  partition(arr, si, ei);
       quickSort(arr, si, pIdx-1);
       quickSort(arr, pIdx+1, ei);

    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei]; 
        int i = si-1; 

        for(int j=0; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap 
                int temp = arr[j] ;
                arr[j] = arr[j]; 
                arr[i] = temp; 
            }
        }

        i++; int temp = pivot; 

        //*  या ठिकाणी  not ->valid  pivot = arr[i]; variable के चेंजेस functions  
        //*  वरती रिफ्लेक्ट नाही करत bcz call by value असते fun मध्ये. no refrence by vlaue 
        arr[ei] = arr[i]; 
        arr[i] = temp;
        return i; 

    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5}; 
        quickSort(arr, 0, arr.length-1);
    }
}

- Quicksort Worst Case Occurs when pivot is always the smallest or the Largest element
- Also Happen in Situation when Our array in Ascending Or Descending 
*/

/*Question 3:  Search In Rotated sorted array.Input sorted, rotated array with distinct numbers(in
ascending Order) It is rotated at pivot point. Find the index of Given element.
*/
/* 
public class Devide_And_Conquer {

    public static int search(int arr[], int tar, int si, int ei){
        
        if(si > ei){
            return -1; 
        }
        //work 
        int mid = si + (ei-si)/2; 

        //case found 
        if(arr[mid] == tar){
            return mid; 
        }

        //mid on L1
        if(arr[si] <= arr[mid]){
            //case a : left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid-1);
            }else{
                //case b : right
                return search(arr, tar, mid+1, ei); 
            }
        }

        //mid on L2
        else{
            //case c : right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid+1, ei); 
            }else{
                //case d : left
                return search(arr, tar, si, mid-1);
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2}; 
        int target = 0; // output -> 4
        int tarIdx = search (arr, target, 0, arr.length-1); 
        System.out.println(tarIdx);
    }
}
    */

//---------------------------------------------------------------

/* Question 1 : Apply Merge Sort to sort an array of String. (Assume that all the character in 
all the Strings are in lowercase.)
*/

/**
 * Devide_And_Conquer
 *//*
    public class Devide_And_Conquer {
    
    public static String[] mergeSort(String arr[], int lo, int hi){
    if(lo == hi){
    String[] A = { arr[lo] };
    return A;
    }
    
    int mid = lo + (hi - lo )/ 2;
    
    String arr1[] = mergeSort(arr, lo, mid);
    String arr2[] = mergeSort(arr, mid + 1, hi);
    
    
    String[] arr3 = merge(arr1, arr2);
    return arr3;
    }
    
    static String[] merge(String[] arr1, String[] arr2) {
    int m = arr1.length;
    int n = arr2.length;
    String[] arr3 = new String[m + n];
    
    int idx = 0, i = 0, j = 0;
    
    
    while(i < m && j < n){
    if(isAlphabeticallySmaller(arr1[i], arr2[j])){
    arr3[idx] = arr1[i];
    i++;
    idx++;
    }
    
    else{
    arr3[idx] = arr2[j];
    j++;
    idx++;
    }
    
    }
    while (i < m){
    arr3[idx] = arr1[i];
    i++;
    idx++;
    }
    
    while (j < n){
    arr3[idx] = arr2[j];
    j++;
    idx++;
    }
    
    return arr3;
    
    }
    
    //Return true if str1 appears before str2 in alphabetical order
    static boolean isAlphabeticallySmaller(String str1, String str2){
    if(str1.compareTo(str2) < 0) {
    return true;
    }
    
    return false;
    }
    public static void main(String[] args){
    String[] arr = {"sun", "earth", "marse", "mercury"};
    String[] a = mergeSort(arr, 0, arr.length-1);
    
    for(int i=0; i<a.length; i++){
    System.out.println(a[i]);
    }
    }
    
    }
    */

/*
  *Question 2: Given an Arrau nums of size n, return the majority element.
  
  The majority element is the element that appears more than Ln/2L times. You
  may assume
  that the majority element always exists in the array.
  
  - Approach 1 : Brute Force Approach :
  - idea : Cout the number of times each number occurs in the array & find the
  largest count.
  The Complexity - O(n^2)
 */

/*
 public class Devide_And_Conquer {
 public static int majorityElement(int nums[]){
 int majorityCount = nums.length/2;
 
 for(int i=0; i<nums.length; i++){
 int count = 0;
 
 for(int j=0; j<nums.length; j++){
 if(nums[j] == nums[i]){
 count += 1;
 }
 }
 
 if(count > majorityCount){
 return nums[i];
 }
 }
 
 return -1;
 }
 public static void main(String[] args) {
 int nums[] = {2, 1, 1, 1, 1, 2, 2};
 System.out.println(majorityElement(nums));
 }
 }
 */

/*
 * Approach 2: Divide & conquer
 idea : If we know the majority element in the left and right halves of an
 array, we can
 determine which is the global majority element in linear time.
 
 Here, we apply a classical divide & conquer approach that recurses
 on the left and right halves of an array until an answer can be
 trivially achieved for a length-1 array. Note that because actually
 passing copies of subarrays consts time and space, we instead pass
 lo and hi indices that describe the relevant slice of the overall
 array. In this case, the majority element for a length-1 slice is
 triviallyy its only element, so the recursion stops there. If
 current slice longer than length-1, we must combine the answers for
 the slice's left and right halves. If they agrre on the majority
 element, then the majority element for the overall slice is
 obviously the same[1]. if they disagrre, only one of them can be
 "right", so we need to count the occurances of the left and right
 majority elements to determine which subslice's answer is globally
 correct. The overall answer for the array is thus the majority
 elements betweent endices 0 and n.
 * 
 * Time complexity - O(n*logn)
 * 
 */

/*
  
  
  public class Devide_And_Conquer {
  // lo = low index hi = high index
  private static int countInRange(int nums[], int num, int lo, int hi) {
  int count = 0;
  for (int i = lo; i <= hi; i++) {
  if (nums[i] == num) {
  count++;
  }
  }
  
  return count;
  }
  
  public static void main(String[] args) {
  
  }
  
  private static in majorityElementRec(int nums[], int lo, int hi) {
  if (lo == hi) { // base case: the only element in an array of size 1 is the
  majority element.
  return nums[lo];
  }
  
  // recurse on left and right halves of this slice.
  
  int mid = lo + (hi - lo) / 2;
  int left = majorityElementRec(nums, lo, mid);
  int right = majorityelementRec(nums, mid + 1, hi);
  
  // if the two hlaves agree on the majority element, return it.
  if (left == right) {
  return left;
  }
  
  // otherwise, count each element and return the "winner".
  int leftCount = countRange(nums, left, lo, hi);
  int rightCount = countInRange(nums, right, lo, hi);
  
  return leftCount > rightCount ? left : right;
  
  }
  
  public static int majorityElement(int nums[]) {
  return majorityElementRec(nums, 0, nums.length - 1);
  }
  
  public static void main(String args[]) {
  int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
  System.out.println(majorityElement(nums));
  }
  }
 */

/*
  Question 3: Given an array of integers. Find the inversion Count in the
array.
Inversion Count : For an array, Inversion count indicates how far(or close)
the array is from being sorted. If the array is already sorted then the
inversion
count is 0. If an array is sorted in the reverse order then the inversion
count
count is the maximum. Formally, two elements [i] and a[j] form an inversion
if
a[i] > a[j] and i < j

Solution 3: Approach 1 - Brute force Approach
Idea ; Traverse through the array. This can be done using a nested loop.
Sum up the counts for all indexes in the array and print the sum.
- Traverse through the array from start to end
- for every element, find the count of elements smaller than the current
number up to that index using another loop.
- Sum up the count of inversion for every index.
- Print the count of inversions.
  - Time complexity - O(n^2)
 */
/* 
public class Devide_And_Conquer {

    public static int getInvcount(int arr[]){
        int n = arr.length;
        int invcount = 0; 

        for(int i=0; i<n-1; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] > arr[j]){
                    invcount++; 
                }
            }
        }

        return invcount; 
    }


    public static void main(String[] args){
        int arr[] = {1, 20, 6 , 4, 5}; 
        System.out.println("Inversion Count = " + getInvcount(arr));
    }
}
*/ 

/*
*Approach 2: Modified Merge Sort 
*Idea : Suppose the number of inversions in the left half and right half of the array
(left be inv1 and inve2); what kinds of inversions are not accounted for in inv1 + inv2? 
The answer is - the inversions that need to be counted during the merge step. Therefore, 
to get the total number of inversions that need to be added are the number o inversions in 
the left subarray, right subarray, and merge(). 
- Basically, for each array element, count all elements more thean it to its left and add 
the count to the output. This whole magic happens inside the merge function of merge sort.
*Time Complexity - O(n*logn)

*/

public class Devide_And_Conquer {

    public static int merge(int arr[], int left, int mid, int right) {
        int i = left, j = mid, k = 0;
        int invCount = 0;
        int temp[] = new int[(right - left + 1)];

        while ((i < mid) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                k++;
                i++;
            } else {
                temp[k] = arr[j];
                invCount += (mid - i);
                k++;
                j++;
            }
        }

        while (i < mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }

        while (j <= right) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return invCount;
    }

    private static int mergeSort(int arr[], int left, int right){
        int invCount = 0; 

        if(right > left){
            int mid = (right + left)/2; 

            invCount = mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid+1, right);
            invCount += merge(arr, left, mid + 1, right); 
        }
        return invCount; 
    }

    public static int getInversion(int arr[]){
        int n = arr.length; 
        return mergeSort(arr, 0, n - 1); 
    }

    public static void main(String args[]){
        int arr[] = {1, 20, 6, 4, 5}; 
        System.out.println("Inversion Count = " + getInversion(arr));
    }
}