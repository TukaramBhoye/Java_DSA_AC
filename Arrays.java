// 15:NB: arrays Part-1:NB:32 :

// 1:input/Output: ------------------

/*
import java.util.*;
public class Arrays {
public static void main(String args[]){
int marks[] = new int[100];
Scanner sc = new Scanner(System.in);

marks[0] = sc.nextInt();
marks[1] = sc.nextInt();
marks[2] = sc.nextInt();

System.out.println("phys : "+marks[0]);
System.out.println("chem : "+marks[1]);
System.out.println("math : "+marks[2]);

int percentage = (marks[0] + marks[3]/3);

System.out.println("marks percen tage: "+percentage);

// calculate length of array

System.out.println("marks length: "+marks.length);

}
}
 */
// 2: Arrays as Functions/arguments:
/*
public class Arrays {

public static void update(int marks[], int nonChangeable){
 nonChangeable = 10;

for(int i=0; i<marks.length; i++){
marks[i] = marks[i] + 1;
}
}
public static void main(String[] args){
int marks[] = {97, 98, 99};
int nonChangeable = 5;
update(marks, nonChangeable);
System.out.println(nonChangeable);

for(int i=0; i<marks.length; i++){
System.out.println(marks[i]+ " ");
}
}

}
 */

// Q:3: . LinearSearch : find a given key:
/*
public class Arrays {

public static int LinearSearch(int arr[], int key){

for(int i = 0; i<arr.length; i++){
if(arr[i] == key){
return i;
}
}
return -1;
}
public static void main(String[] args){
int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
int key = 20;

int index = LinearSearch(arr, key);
if(index == -1){
System.out.println("key not found: ");
}else{
System.out.println("key is at index : "+index);
}
}
}
 */

// Q. 4: find the largest value from given Array
/*
public class Arrays {

public static int getLargestVal(int arr[]){
int largest = Integer.MIN_VALUE; // -infinity
int smallest = Integer.MAX_VALUE;

for(int i=0; i<arr.length; i++){
if(largest < arr[i]){
largest = arr[i];
}
if(smallest > arr[i]){
smallest = arr[i];
}
}
System.out.println("smallest value is : "+ smallest);
return largest;
}
public static void main(String[] args) {
int arr[] = {2, 3, 5, 10, 6, 45, 8, 3};

System.out.println("largest Value is: "+ getLargestVal(arr));
}
}
 */

//* */ Q.5: Binary Search : use find the key : Prerequisite->sorted Arrays
//* find mid: mid = (start + end)/2; : it increase 2->4->8 if not find
/*
class Arrays{
public static int binarySearch(int numbers[], int key){
int start = 0, end = numbers.length-1;

while(start <= end){
int mid = (start + end/2);

if(numbers[mid] == key){
return mid;
}
if(numbers[mid] < key){
start = mid+1;
}else{
end = mid-1;
}
}
return -1;
}
public static void main(String[] args){
int numbers[] = {2, 4, 6, 8, 10, 12, 14}; // sorted Array
int key = 10;

System.out.println("index for key is: "+ binarySearch(numbers, key));
}
}
 */

// Q.6: Reverse An Array :
/*
import java.util.Scanner;

public class Arrays {

public static void Reverse(int numbers[]){
int first = 0, last = numbers.length-1;

while(first < last){

// swap
int temp = numbers[last];
numbers[last] = numbers[first];
numbers[first] = temp;

first++;
last--;
}
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

int numbers[] = {2, 4, 6, 8, 10};
Reverse(numbers);

// print
for(int i = 0; i <numbers.length; i++){
System.out.println("Reverse Numbers: "+numbers[i]+" ");
}
}
}
 */

// Q. 7: pairs in An Array :
/* 
public class Arrays {

public static void Pairs_Arr(int numbers[]){
int tp = 0;
for(int i = 0; i<numbers.length; i++){
int curr = numbers[i];
for(int j=i+1; j<numbers.length; j++){
System.out.print(" ("+ curr+ ", "+ numbers[j]+ ") ");

tp ++;
}
System.out.println();
}
System.out.println("Total_Pairs: "+tp);
}

public static void main(String[] args){
int numbers[] = {2, 4, 6, 8, 10};
Pairs_Arr(numbers);
}
}
 */
// Q. 8: subArray of An Array OR that sub Arrays Sum :
/*
public class Arrays {

public static void printSubArray(int numbers[]){
int count_tsa = 0;

for(int i = 0; i<numbers.length; i++){
int start = i;
for(int j = i; j < numbers.length; j++){
int end = j;
int subArraySum = 0;
for(int k = start; k <= end; k++){
System.out.print(numbers[k]+" ");
subArraySum += numbers[k];
}

count_tsa++;
System.out.print(" => sum "+ subArraySum);
System.out.println();
}
System.out.println();
}
System.out.println("count Total Sub Array : "+count_tsa);
}
public static void main(String[] args){
int numbers[] = {2, 4, 6, 8, 10};
printSubArray(numbers);
}
}
 */
// 9: Print sum OF SubArray and max Sum :
// Time Complexity: O(n^3) : worst case Time comlexity :
/*
public class Arrays {
public static void maxSubArray(int n[]){

int maxSum = Integer.MIN_VALUE;

for(int i=0; i<n.length; i++){
int start = i;
for(int j=i; j<n.length; j++){
int end = j;
int currSum = 0;
for(int k=start; k<=end; k++){
currSum += n[k];

}
System.out.print(" sum: "+currSum+" " );
if(maxSum<currSum){
maxSum = currSum;
}

}
System.out.println();
}
System.out.println(" max sum : "+ maxSum);
}
public static void main(String[] args){
// int numbers[] = {2, 4, 6, 8, 10};
int numbers[] = {1, -2, 6, -1, 3};
maxSubArray(numbers);
}
}
 */

// 10: Print sum OF SubArray and max Sum :
// Time Complexity: O(n^2) <<< O(n^3) :
/*
public class Arrays {
public static void maxSubArray(int n[]) {

int maxSum = Integer.MIN_VALUE;
int prefix[] = new int[n.length];
prefix[0] = n[0];

// calculate prefix Array :
for (int i=1; i<prefix.length; i++) {
prefix[i] = prefix[i - 1] + n[i];
}

for (int i = 0; i < n.length; i++) {
int start = i;
for (int j = i; j < n.length; j++) {
int end = j;

int currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
if (maxSum < currSum) {
maxSum = currSum;
}

}

}
System.out.println(" max sum : " + maxSum);
}

public static void main(String[] args) {
// int numbers[] = {2, 4, 6, 8, 10};
int numbers[] = { 1, -2, 6, -1, 3 };
maxSubArray(numbers);
}
}
 */

// 11: maXSubArray Sum Using Kadanes Algoritham :
/*
class Arrays{
public static void Kadanes(int numbers[]){
int ms = Integer.MIN_VALUE;
int cs = 0;

for(int i=0; i<numbers.length; i++){
cs = cs + numbers[i];
if(cs < 0){
cs = 0;
}
ms = Math.max(cs, ms);
}
System.out.println("ms: "+ms);
}

public static void main(String[] args){
int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};

Kadanes(numbers);
}

}
 */
/*
Q. 12: Give an non-Negative integer representing an elevation map where the
width
of each bar is 1, compute how much waater it can trap after raining.
height = [4, 2, 0, 6, 3, 2, 5];
 *//*
        public class Arrays{
        public static int trappedRainWater(int height[]){
        int n = height.length;
        // calculate ledt max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        
        for(int i=1; i<n; i++){
        leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        
        //calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        
        int trappedWater = 0;
        // loop
        
        for(int i=0; i<n; i++){
        int waterLevel = Math.min(leftMax[i], rightMax[i]);
        
        //trapped Water = waterLevel - height[i]
        trappedWater += waterLevel - height[i];
        }
        
        return trappedWater;
        }
        
        public static void main(String[] args){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        
        trappedRainWater(height);
        }
        }
         */

/* 13: Buy and sell Stocks Prices : prices = [7, 1, 5, 3, 6, 1] */
/*
import java.util.*;

public class Arrays{
public static int buyAndSellStocks(int prices[]){
int buyPrices = Integer.MAX_VALUE;
int maxProfit = 0;

for(int i = 0; i<prices.length; i++){
if(buyPrices < prices[i]){ // profit
int profit = prices[i] - buyPrices; // today's profit
maxProfit = Math.max(maxProfit, profit);
}else{
buyPrices = prices[i];
}
}
return maxProfit;
}
public static void main(String[] args){
int prices[] = {7, 1, 5, 3, 6, 4};
System.out.println(buyAndSellStocks(prices));
}
}
 */
// Assignments:
// -----------------------------------------------------------------
/*
Q. 1:Given an integer array nums, return true if any value appears at leas
twice in the array,
and return false if every element is distinct.
 */
/*
import java.util.*;
public class Arrays {
public static boolean containsDuplicate(int nums[]){
for(int i = 0; i<nums.length-1; i++){
for(int j=i+1; j<nums.length; j++){
if(nums[i] == nums[j]){
return true;
}
}
}

return false;
}
public static void main(String[] args){
int nums[] = {1, 2, 3};

System.out.println(containsDuplicate(nums));

}
}
- Second APProach
 */ /*
             import java.util.*;
             public class Arrays {
             public static boolean containsDuplicate(int nums[]){
             HashSet<Integer> set = new HashSet<>();
             
             for(int i=0; i<nums.length; i++){
             if(set.contains(nums[i])){
             return true;
             }else{
             set.add(nums[i]);
             }
             }
             return false;
             }
             public static void main(String[] args){
             int nums[] = {1, 2, 3, 2};
             System.out.println(containsDuplicate(nums));
             }
             }
          */

/*
  Q. 2: there is an integer array nums sorted in ascending order(with distinct
  values)
  prior to being passed to your function, nums is possibly rotated at an
  unknown.
  pivot index k(1 <= k < nums.length) such that the resulting array is[nums[k],
  nums[k+1], ..., nums[n-1], nums[0], nums[1], ...nums[k-1]] (0-indexed). For
  example,[0, 1, 2, 3, 4, 5, 6, 7] might be rotated at pivot index 3 and
  becomes[4, 5, 6, 7, 0, 1, 2].
  
  Given the array nums after the possible rotation and an integer target,
  return the index of
  target if it is in nums, or - 1 if if it is not in nums.
  You must write an algorithm with O(log n) runTime complexity.
 */
/* 
import java.util.*;

public class Arrays {
       // min will have indext of minimum element of nums
       public static int search(int nums[], int target){
       
       int min = minSearch(nums);
       // find in sorted left or right part
       
       if(nums[min] <= target && target <= nums[nums.length-1]){
       return search(nums, min, nums.length-1, target);
       }
       else{
       return search(nums, 0, min -1, target);
       }
       }
       // binary search to find target in left to right boundary
       public static int search(int nums[], int left, int right, int target){
       int l = left;
       int r = right;
       
       // System.out.println(left+" "+target);
       while(l <= r){
       int mid = l + (r - 1)/2;
       
       if(nums[mid] == target){
       return mid;
       }else if(nums[mid] > target){
       r = mid-1;
       }else{
       l = mid + 1;
       }
       
       }
       return -1;
       }
       
       // smallest element index :
       public static int minSearch(int nums[]){
       int left = 0;
       int right = nums.length-1;
       
       while(left < right){
       int mid = left + (right - left)/2;
       if(mid > 0 && nums[mid-1] > nums[mid]){
       return mid;
       }else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
            left = mid+1;
       }else{
            right = mid - 1;
       }
       }
            return left;
       }    
       
       public static void main(String[] args){
            int nums[] = {4, 5, 6, 7, 0, 1, 2};
            int target = 0;
            
            System.out.println(search(nums, target));
       }
    }
*/
/*
  Q.3: You are given an array proces where proces[i] is the price of a given
  stock on the ith day.
  
  return the maximum profit you can achieve from this tranjaction. If you
  cannot achieve any profit,
  return 0.
  
  Example: prices = [7, 1, 5, 3, 6, 4]
  output: 5
 */
/*
 import java.util.*;
 public class Arrays {
 
 public static int maxprofit(int prices[]){
 int buy = prices[0];
 int profit = 0;
 
 for(int i = 1; i < prices.length; i++){
 if(buy < prices[i]){
 profit = Math.max(prices[i] - buy, profit);
 }
 else{
 buy = prices[i];
 }
 }
 return profit;
 }
 public static void main(String[] args){
 int prices[] = {7, 1, 5, 3, 6, 4};
 
 System.out.println("max_Profit is: "+maxprofit(prices));
 }
 }
 */

/*
Q.4: Given n non-negative integers presenting na elevation map
where the width of each bar is 1, compute how much water it can
trap after raining.

example: input : height = [0, 1, 0, 2, 1, 3, 2, 1, 2, 1]
output: 6
 */
/*
import java.util.*;
public class Arrays {

public static int waterElevation(int height[]){
int n = height.length;

int res = 0, l = 0, r = n - 1;
int rMax = height[r], lMax = height[l];

while(l < r){
if(lMax < rMax){
l++;
lMax = Math.max(lMax, height[l]);
res += lMax - height[l];
}else{
r--;
rMax = Math.max(rMax, height[r]);
res += rMax - height[r];
}
}
return res;
}
public static void main(String[] args){
int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
System.out.println("rainWater: "+ waterElevation(height));
}
}
 */

/*
*Q.5: Given an Integer array nums, return all the triplets[nums[i], nums[j],
nums[k]]
such that i !=j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.

Example 1: input: nums = [-1, 0, 2, -1, -4];

output = [[-1, -1, 2], [-1, 0, 1]];

Approach Let us try to understand the problem statement: -->
The first part of the problem statement is clear, we are asked to find out
all the triplets
in the given array whose sum is equal to zero. A triplet isnothingbutaset of
three numbers in the given array.For example,if nums=[1,2,3,4]is the given array,
[1,2,3][2,3,4][1,3,4] etc are its triplets.
What does the condition i != j, i != k, and j != k mean?

It means that we are not allowed to reuse any number from the array within a
triplet.
Example,for the given array nums = [1,2,3,4], triplets[1,1,1] or [1,1,2] or
[1,2,2] etc are not considered validtriplets.

The last condition that we need to consider is that we cannot have duplicate
triplets in our final result.
Example: if[-2,-2,0,2]is the given array,we can only consider one of
[-2,0,2]fromindexes 0, 2,3 and
[-2,0,2]from indexes 1,2,3 in our final result.BRUTE FORCE - The simple solution to
this problem is to
find every possible triplet from the givenarray, see if its sum is equal to
zero and return the
result (ensuring there are no duplicate triplets in the result).This algorithm
involves the following

*steps:
1. Use three loops to generate all possible triplets for the
en array, with each loop variable
ping track of 1 triplet element each.
2. Next we calculate the sum for each triplet generated in step 1.
3. If the sum is equal to 0 we need to check if it is a unique triplet (not
our result set).
ure the triplets in our result set are unique by sorting
s and adding it to a hashmap
over writes data if the same value is written to the same key multiple
by eliminating duplicates).
4. Once we have added all the triplets whose sum is equal to 0 into
the hashmap, we iterate through the hashmap and add it to our result array.
5. Finally we return the result array
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Arrays {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);

                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }

        Set<List<Integer>> set = new LinkedHashSet<>(result);
        result.clear();
        result.addAll(set);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = threeSum(nums);
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
