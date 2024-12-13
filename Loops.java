// 11:NB:13: Loops : 

/* import java.util.*; 
class Loops{
   public static void main(String[] args){
       int counter = 0; 
       while(counter<100){
           System.out.println("Hello world");
           counter++; 
       }
       System.out.println("Printed HW 10x: ");
   }
}
 */
//_19/06/20244___Java|NB|13|_______________________________________
/*1: While loop : In Java, loops are control flow statements that repeatedly 
   execute a block of code as long as a specified condition is true. The main 
   types of loops are for, while, and do-while. */

/*
ex: 1
import java.util.*; 
class Conditional_statem{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in); 
      int range = sc.nextInt(); 
      int counter = 1; 

      while(counter <= range){
       System.out.print(counter+" ");
       counter++; 
      }
      System.out.println();  
   }
} */

//ex: 2:Print sum off N natural Numbers : n = 5: 1+2+3+4+5=15
/* 
import java.util.*; 
public class Conditional_statem{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 
    int sum = 0; 
    int i = 1; 

    while(i<=n){
      sum = sum + i; 
      System.out.print(" sum is: "+sum);
      i++; 
    }  
    System.out.print(" last print : "+sum); 
  }
}
*/
/*2: NB:13: For Loop: which work we done through while loop same as 
    A for loop in Java is used to execute a block of code a 
    specific number of times, defined by an initialization, 
    a termination condition, and an increment/decrement. It is 
    particularly useful for iterating over arrays or collections.*/

/*
 * public class Condtional_statem{
  public static void main(String[] args){
    for(int i = 0; i<10; i++){
        System.out.println("Hello Hi: ");
    }
  }
}
 */
//3: Square shape using stars 
/*public class Condtional_statem{
 public static void main(String[] args){
   for(int i = 0; i<4; i++){
       System.out.println("* * * *  ");
   }
   System.out.println("while loop ");
   int i = 0; 
   while(i<4){
     System.out.println("* * * * ");
     i++; 
   }
 }
} */
/* 4: trick 1: print the revrse of a Number: n = 45678
public class Conditional_statem{ 
  public static void main (String[] args){
    int n = 45678; 

    while(n>0){
      int lastDig = n%10; 
      System.out.println("reverse n is:\t " + n + "\treverse lastDig is "+lastDig);
      n = n/10; 
      O/P: 
        reverse n is:    45678  reverse lastDig is 8
        reverse n is:    4567   reverse lastDig is 7
        reverse n is:    456    reverse lastDig is 6
        reverse n is:    45     reverse lastDig is 5
        reverse n is:    4      reverse lastDig is 4 
    }
  } 
}*/

// 4: trick 1: print the revrse of a Number: n = 45678
/*public class Loops{
    public static void main(String[] args){
        int n = 45678;
        int rev = 0; 

        while(n>0){
        int lastDig = n % 10;
        rev = (rev * 10) + lastDig; 
        
        n = n / 10; 
        }
        System.out.println("The Reverse number is: "+rev);
    }
}*/

// 5: Do while Loop : same as while but first condition after terminate: 
/*Syntax: do{
 * //do something
} while(condition); */
/*
import java.util.*; 
public class Loops{
   public static void main(String[]args){ 
       int counter = 1; 
               
       do{
           System.out.println("counter: "+counter);
           counter++;
       }while(counter <=10); 
   }
}  */

// i. Break & ii. continue Statement: exit from the block of code
/* import java.util.*; 
public class Loops{
    public static void main(String[]args){ 
      
         for (int i = 0; i<=5; i++){
        if(i == 3){
            break;
           }
           System.out.println(i);  
      }
      System.out.println(("I am out of the loop"));
       

      Scanner sc = new Scanner(System.in);
    */
/* 
      do{
        System.out.println("enter yout number: ");
        int n = sc.nextInt(); 
        if(n % 10 == 0){
            break; 
        }
        System.out.println(n);
      }while(true);
*/

//ii. continue statement: 
/* 
  for(int i=0; i<=5; i++){
    if(i==3){
      continue; // skip 3 value 
    }
    System.out.println("The index is: "+i);
  }
  */
/* 
  do{
    int n = sc.nextInt(); 
    if(n%10 == 0){
        continue; 
    }
    System.out.println("number was: "+ n);
  }while(true); // not get harm but continue will run until we not close the window. 
  
  }
}
*/

// 6: Check if a number is prime or not 

/*
 * import java.util.*; 

public class Loops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    int num = sc.nextInt(); 

    if (num == 2) {
      System.out.println("Number is prime " + num);
    } else { 
      boolean isPrime = true; 
      // (int i = 2; i<=Math.sqrt(n); i++) ; this also works
      for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
          isPrime = false;
        }
      }
      if (isPrime) {
        System.out.println("Number is prime " + num);
      } else {
        System.out.println("Number is not prime " + num);
      }
    }
    
    sc.close();  // Close the scanner to prevent resource leaks
  }
}
 */
// Assignments: 
import java.util.*;

public class Loops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int fact = 1;
    // for(int i =2; i<=n; i++){
    // fact = fact * i;
    // }
    // System.out.println("fact is "+fact);

    // 2.
    System.out.println("enter the number: ");
    int num = sc.nextInt();
    int num2 = 1;
    while (num2 <= 10) {
      System.out.println(num + "== " + num2 + "== " + num * num2);
      num2++;
    }

  }
}
