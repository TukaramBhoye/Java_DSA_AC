// 18:NB:45: Chpater -> 2-D Array: 

/*Q.1: print a 2D-Matrix 
import java.util.*; 

public class Arrays_2D {
    public static boolean search(int matrix[][], int key){
        for(int i = 0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell(" + i + " "+" j "+j);
                    return true; 
                }
            }
        }
        return false; 
    }
    public static void main(String [] args){
        int matrix[][] = new int[3][3]; 
        int n = matrix.length, m = matrix[0].length; 

        Scanner sc = new Scanner(System.in); 
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt(); 
            }
        }

        // Output: 
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix, 5); 
    }
}       
*/

// Q:6 : Spiral Matrix:  imp-> interview purpose : MANG 
/*
import java.util.*;

public class Arrays_2D {
    public static void SpiralMatrix(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            System.out.println();

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            System.out.println();

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }

                System.out.print(matrix[endRow][j] + " ");
            }
            System.out.println();

            // left
            for (int j = endRow - 1; j >= startRow + 1; j--) {
                if(startCol == endCol){
                    break; 
                }
                System.out.print(matrix[j][startCol] + " ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        SpiralMatrix(matrix);

    }
}
    */

// Q.7: print sum of diagonal Matrix: 
/*
public class Arrays_2D {
    public static int SumOfDiagonal(int matrix[][]) { // O(n^2)
        int sum = 0;
        // brute force approach : jo bhi mila laga diya
        // for(int i=0; i<matrix.length; i++){
        // for(int j=0; j<matrix[0].length; j++){
        // if(i==j){
        // sum += matrix[i][j];
        // }else if(i+j == matrix.length-1){
        // sum += matrix[i][j];
        // }
        // }
        // }

        for (int i = 0; i < matrix.length; i++) { // O(n) ;
            // pd
            sum += matrix[i][i];

            // sd
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.println(SumOfDiagonal(matrix));
    }
}
 */

// Search in a Sorted Matrix : 
/* 
import java.util.*; 
public class Arrays_2D {
   public static boolean stairCaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1; 

    while(row < matrix.length  && col >= 0){
        if(matrix[row][col] == key){
            System.out.println("found key at ("+ row + ","+col+")");
            return true; 
        }
        else if(key < matrix[row][col]){
            col--; 
        }else{
            row++; 
        }       
     }
     System.out.println("key not found");
     return false; 
   }
   
   public static void main(String[] args){
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}}; 
        int key = 33; 
        stairCaseSearch(matrix, key);
    }
}
*/ 

//Assignments : 2D Arrays Questions  ------------------------------------------------------------

/*Questions 1: Print the number of 7's that are in the 2d array 
 Example: 
    Input - int [] [] = {4, 7, 8}{8, 8, 7}; 
    Output - 2: 
    Key : 7
 */ 
/*
public class Arrays_2D {
    public static void Findkey(int array[][], int key){
        int count = 0; 
        for(int i = 0; i < array.length; i++){
           for(int j=0; j<array[0].length; j++){
            if (array[i][j] == key){
                // return key; 
                count++; 
            }
          }   
        }
        System.out.println("count of 7 is : "+ count);
    }
    public static void main(String[] args){
        int array[][] = {{4, 7, 8},
                        {8, 8, 7}}; 

        int key = 7; 
       Findkey(array, key);
    }
}*/ 

/*print out the sum of the numbers in the second row of the "nums" array 
 *examp: input = int[][]nums = {1, 4, 9},{11, 4, 3}, {2, 2, 3}; 
  Output - 18 ;
 */
/* 
public class Arrays_2D {
    public static void SecondRowSum(int nums[][]){
       
        int sum = 0; 
        for(int i=0; i<nums.length; i++){  
               sum = sum + nums[1][i];
        }
        System.out.println("sum "+sum);
    }

    public static void main(String[] args){
        int nums[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}}; 
        SecondRowSum(nums); 
    }
}
*/ 

/*  question 3 : write a program to find Transpose of a Matrix : 
    What is transpose? 
    Transpose of a matrix is the porcess of swapping the rows to columns for a 2*3 matrix.

    Mtrix : 
    a11 a12 a13 
    a21 a22 a23
*/
/* */
public class Arrays_2D {
    public static void transposeMatrix(int arr[][]){
        int transpose[][] = new int[3][2]; 

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                transpose[j][i] = arr[i][j]; // Correct index swapping
            }
        }

        // System.out.println("Original Matrix:");
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // } 

        System.out.println("transpose Matrix: ");
        
            for(int i=0; i<transpose.length; i++){
                for(int j=0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }   
    }

    public static void main(String[] args){
        int arr[][] = {{11, 12, 13}, 
                       {21, 22, 23}};

        transposeMatrix(arr); 
    }
}