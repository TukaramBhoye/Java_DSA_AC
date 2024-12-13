/*22:NB:78: Recursion: Recursion is a method it is use to solve computational Problem 
where the Solution Depends On Solution to smallers instance of the same Problem. */ 


// Q1 : Print numbers in the  Decreasing Order : n = 10
/* 
public class Recursion{
    public static void printDec(int n){
        if(n == 1){ 
            System.out.println(n); 
            return; 
        }
        System.out.print(n+" "); 
        printDec(n-1);  
    }

    public static void main(String[] args){
        int n = 10; 
        printDec(n);
    }
}
    */ 

// Q2 : print numbers in the increasing Order : n = 10
/* 
public class Recursion{
    public static void Increas(int n){
        if(n == 1){ 
            System.out.print(n+" "); 
            return; 
        }

        Increas(n-1);
        System.out.print(n+" "); 
         
    }

    public static void main(String[] args){
        int n = 10; 

        Increas(n); 
    }
}*/ 

// Question 3  : Factorial numbers: n  = n * (n-1) * (n-2) 
/* 
public class Recursion{
   public static int fact(int n) {
        if(n == 0 ){
            return 1; 
        }

        int fnm = fact(n-1); 
        int fn = n * fact(n-1); 

        return fn; 
   }

   public static void main(String args[]){
        int n = 5; 
        System.out.println(fact(n)); 
   }
}
*/ 


// Q.4 : Sum Of n natural numbers
/* 
public class Recursion{
    public static int Natural(int n){

        if(n == 0){
            return 0; 
        }

        int Snm = Natural(n - 1);
        int Sn = n + Snm; 
        return Sn; 
    }
    public static void main(String[] args){
        int n = 5; 
        System.out.println(Natural(n));
    }
}
    */ 


    // Question 5:  Print the Sum Of Nth fibonacci number 

/* 
    public class Recursion {
        public static int fib(int n){
            if(n == 0 || n == 1){
                return n; 
            }

            int f1 = fib(n-1); 
            int f2 = fib(n-2); 
            int fibonacci=f1 + f2; 
            return fibonacci;
        }
        public static void main(String[] args) {
           
            System.out.println(fib(25));
        }
}

*/ 
// Question 6: check the Given Array is Sorted or Not.
/* 
public class Recursion {
  
   public static boolean isSorted(int arr[], int i){
      
        if(i == arr.length){
            return true; 
        }

        if(arr[i] > arr[i+1]){
            return false; 
        }

        return isSorted(arr, i+1);
   }

// Q. 7: Find First Occurance of an Element in Array 

   public static int firOccur(int arr[], int i, int key){
        
    if(i == arr.length){
        return -1;
    }

    if(arr[i] == key){
        return i; 
    }

    return firOccur(arr, i+1, key);
}

//Find LaSt Occurance
public static int lastOccurance(int arr[], int i, int key){
    if(i == arr.length){
        return -1; 
    }

    int isFound = lastOccurance(arr, i+1, key);

    if(isFound == -1 && arr[i] == key){
        return i; 
    }

    return isFound; 
} 
    
    public static void main(String[] args) {
        int arr[] = {2, 3 , 4, 5, 6, 5, 7 }; 
        // System.out.println(isSorted(arr, 0));

        System.out.println(lastOccurance(arr, 0, 5));
    }
}
*/ 


// Question 8: find The Pow OF X 
 
public class Recursion {
    public static int Power(int x, int n){
        if(n == 0){
            return 1; 
        }
        // int xnm1 = Power(x, n-1);
        int xn = x * Power(x, n-1);

        return xn; 
    }

    // Optimize Power

    public static int optimizePower(int a, int n){
        if(n == 0){
            return 1 ; 
        }
        // O(n) 
        // int halfPowerSq = optimizePower(a, n/2) * optimizePower(a, n/2); 

        int halfPower = optimizePower(a, n/2);
        int halfPowerSq = halfPower * halfPower; 
        // n is odd
        if(n % 2 != 0){
            halfPowerSq = a * halfPowerSq; 
        }

        return halfPowerSq; 
    }
    public static void main(String[] args) {
        System.out.println(optimizePower(2, 3));
    }
}




