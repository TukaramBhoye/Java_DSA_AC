// 1: 
/*public class JavaBasics{
    public static void main(String args[]){
        System.out.print("Hello World"); // without line space 
        System.out.println("Hello World"); // line ka space 
        System.out.println("Hello World"); 
      
    }
} */

//2: 
/* 
public class JavaBasics{
    public static void main(String args[]){
        System.out.println("* * * *");
        System.out.println("* * * ");
        System.out.println("* *");
        System.out.println("* ");
    }
}
*/
// 3:
/*
public class JavaBasics{
    public static void main(String args[]){
        int a = 10; 
        int b = 5; 
        System.out.println(a); 
        System.out.println(b); 
        String name = "Tony Stark"; 
        System.out.println(name); 

        a = b; 
        System.out.println(a); 
    }
}
*/
//4: 
/*Data Types In Java  : 
- 1) Primitive  or    2)  Non-Primitive 
*/
/*
 * public class JavaBasics{
    public static void main(String args[]){
        byte b = 8; 
        System.out.println(b);
        char ch = 'a'; 
        System.out.println(ch);
    }
}
*/
// 5: 
/* 
public class JavaBasics{
    public static void main(String args[]){
       int a = 10; 
       int b = 5; 
       int sum = a + b; 
       System.out.println(sum);
    }
}
*/
// 6: 
/*
import java.util.*; 
public class JavaBasics{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); 
        // String input = sc.next(); 
        // System.out.println(input);

        // String name = sc.nextLine(); 
        // System.out.println(name);

        int number = sc.nextInt(); 
        System.out.println(number);

        float price = sc.nextFloat(); 
        System.out.println(price);

    }
}
*/
//7: Product of a & b : 
/* 
import java.util.*;
public class JavaBasics{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); 

        int a = sc.nextInt(); 
        int b = sc.nextInt(); 
        int sum = a * b; 
        System.out.println(sum);
    }
}
*/
// Area Of circle : 3.14 * r * r 
/*
import java.util.*; 
public class JavaBasics{
    public static void main(String args[]){
        Scanner  sc = new Scanner(System.in); 
        float rad = sc.nextFloat();
        float area = 3.14f * rad * rad;  
        System.out.println(area);
    }
}*/

// Type conversion : 
/* 
import java.util.*; 
public class JavaBasics{
    public static void main(String args[]){
        Scanner  sc = new Scanner(System.in); 
       // int number = sc.nextFloat(); //  error: incompatible types: possible lossy conversion from float to int
        float number = sc.nextInt(); // called typeconversion, implicit conversion, widenining
        System.out.println(number);
    }
}*/
// Assignments: 
/* 
import java.util.*; 
public class JavaBasics{ 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int pen, pencil, rubber; 
        pencil = sc.nextInt(); 
        pen = sc.nextInt(); 
        rubber = sc.nextInt(); 

        sc.close();
        float total_cost = pencil + pen + rubber; 
        float gst = total_cost * 0.18f; 

        float finalAmount = total_cost + gst; 
        System.out.println("the gst is: "+gst);
        System.out.println("the finalAmount is: "+finalAmount);
    }
} */
// Unary Operators : 
/* 
import java.util.*; 
public class JavaBasics{ 
    public static void main(String[] args){
       int a = 10; 
       int b = ++a; 

       System.out.println("preincrement: "+a);
       System.out.println("after that val: "+b);

       int c = 10; 
       int d = c++; 
       System.out.println("c is : "+c);
       System.out.println("post_increment of c: "+d);

        int e = 10;
        int f = e--;
        System.out.println("e is : "+e);
        System.out.println("pre_decrement of f: "+f);

        int g = 10;
        int h = --g;
        System.out.println("g is : " + g);
        System.out.println("pre_decrement of h: " + h);
    }
}

*/ 

// Relational Operator: 
import java.util.*; 
public class JavaBasics{ 
    public static void main(String[] args){
      int A = 10; 
      int B = 5; 

    //   System.out.println(A > B); 
    //   System.out.println(A < B); 
    //   System.out.println(A == B); 
    //   System.out.println(A != B); 
    //   System.out.println(A <= B); 
    //   System.out.println(A >= B); 
    
    // Logical Operator : 
      System.out.println((3 > 2) && (5 > 0));// true true : true
      System.out.println((3 > 2) || (5 > 2)); // t t : t
      System.out.println(!(5 > 0)); // False 

      // Assignment Operator : 
        int c = 5, d=5 , e=5, f=5, g=5; 
        c %= 5; // B = B % 5
        d /= 5; // 1
        e *= 5; 
        f -= 5;
        g += 5;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }
}
