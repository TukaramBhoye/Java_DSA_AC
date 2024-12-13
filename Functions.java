// 13:NB:20: Functions/Methods
/*public class Functions{
    public static void printHelloWorld(){
        System.out.println("Hello World"); //action 
        return; // for void we not write
    }
    public static void main(String[] args){
        printHelloWorld(); 
        
    }
} */
/* 
import java.util.*;
public class Functions{             // called parameter or Formal parameters 
    public static int calculateSum(int num1, int num2){
       int sum = num1 + num2; 
       return sum; 
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in); 

       int a = sc.nextInt(); 
       int b = sc.nextInt(); 
       int c = sc.nextInt(); 
                              // called arguments or actual parameters 
       int sum = calculateSum(a, b);
       System.out.println("Sum is: "+ sum); 
    }
}
*/ 
/* 

import java.util.*;
public class Functions{             // called parameter or Formal parameters 
    public static void swap(int a, int b){ // pass copy of value: pass by value
        
       //swap 
       int temp  = a; 
       a = b; 
       b  = temp; 

       System.out.println("a = "+a);
       System.out.println("b = "+b);
    }
    // product of a & b 
    public static int multiply(int a, int b){
        int product = a * b; 
        return product; 
    }

    //factorial : 
    public static int factorial(int n){
        int f = 1; 

        for (int i = 1; i<= n; i++){
            f = f * i; 
        }
        return f; 
    }

    public static int binCoef(int n, int r){
        int fact_n = factorial(n); 
        int fact_r = factorial(r); 
        int fact_rmn = factorial(r-n); 

        int binCoef = fact_n/fact_r*fact_rmn; 

        return binCoef; 
    }
    public static void main(String[] args){
    
    
       int a = 5; 
       int b = 10; 
       
       int prod = multiply(a, b);
       System.out.println("a * b = "+ prod);

       prod = multiply(10 , 20); 
       System.out.println("a * b: "+prod); 

       // factorial : 
       System.out.println(factorial(5)); // direct go to n 

       // BioNOmial-Coeficient: 
       System.out.println(binCoef(4, 2));
     
    //    //swap  
    // swap(a, b);
    //    System.out.println("a = "+a);  Op: 5
    //    System.out.println("b = "+b);  OP: 10;
    }
}*/


//13:NB:24: Function Overloading: same functions but diffrent parametr or dataType
// duplicate method not allowed
// with parameters
/*public class Functions{
    public static int sum(int a, int b){
        return a + b; 
    }
    public static int sum(int a, int b, int c){
        return a + b + c; 
    }
    public static void main(String[] args){
        System.out.println(sum(2, 4));

        System.out.println(sum(2, 3, 4));
    }
} */

// with Function
/*
 * public class Functions{
    public static float sum(float a,float b){
        return a + b; 
    }
    public static int sum(int a, int b, int c){
        return a + b + c; 
    }
    public static void main(String[] args){
        System.out.println(sum(2.0f, 4.0f));

        System.out.println(sum(2, 3, 4));
    }
}
 
import java.util.*; 
 public class Functions{

 */ 
   /* public static boolean isPrime(int n){
        boolean isPrime = true; 
            for(int i=2; i<n-1; i++){
                if(n % i == 0){
                    isPrime = false; 
                    break; // return isPrime // return false
                }
            }
            System.out.println("the number is : "+n);
            return isPrime; // return true
    } */ /* 
    public static boolean isPrime(int n){
       if(n == 2){
            return true; 
       }
       
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false; 
            }
        }
        return true;        
    } 

    // Print all Prime In a Range : 
    public static void PrimesInrange(int n){
       
       for(int i=2; i<=n; i++){
        if(isPrime(i)){
            System.out.print(i+ " ");
        }
       }
       System.out.println();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 

        // System.out.println(isPrime(n));

        PrimesInrange(n); 
        System.out.println(isPrime(16));
    }
 }

*/ 
/******************************************************************
 * BINARY CONVERSION: 
 *
 ***************************************************************/

/* public class Functions{
    public static void binToDec(int binNum){
        int myNum = binNum ;
        int pow = 0; 
        int decNum = 0; 

        while(binNum > 0){
            int lastDigit = binNum % 10 ; 
            decNum = decNum + (lastDigit *(int) Math.pow(2, pow));
            pow++; 
            binNum = binNum /10; // 
        }

        System.out.println("decimal of " + myNum + "  = "+ decNum);
               // here biNum will become 0 after division so store new var
    }

    public static void main (String[] args){
        binToDec(101);
    }
}
*/ 

public class Functions{
    public static void decToBin(int n){
        int decNum = n; 
        int pow = 0; 
        int biNum = 0 ;

        while(n>0){
            int rem = n % 2; // lastDigit : binary form ka last dig comes with 2
            biNum = biNum + (rem * (int) Math.pow(10, pow)); 
            
            pow++; 
            n = n /2; 
        }

        System.out.println(" biNum form of = dec: is   "+decNum+" = binary: "+ biNum);
    }

    public static void main(String[] args){
        decToBin(5);
    }
}