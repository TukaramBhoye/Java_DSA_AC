// Conditional Statements : 
/*Definition: Java mein conditional statement ka scene kuch 
    aisa hai, jaise tera bhidu decide kar raha ho ki aaj biryani 
    khaane jaana hai ya vada pav se hi kaam chalana hai. */
/* 
import java.util.*; 
public class Conditional_statem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String teraMood = "biryani";
        if (teraMood == "biryani") {
            System.out.println("Chal biryani khate hain!");
        } else {
            System.out.println("Chal vada pav se hi kaam chala lete hain!");
        }
    }
}
*/ 
/*  First Condtion 
import java.util.*; 
public class Conditional_statem {
    public static void main(String[] args){
       int age = 22; 
       if(age >= 18){
        System.out.println("adult : drive, vote");

       }if(age > 13 && age < 18){
            System.out.println("teenager");
       }else{
        System.out.println("not adult");
       } 
    }
}
*/ 
/* Q. is a > b = 
 * import java.util.*; 
public class Conditional_statem {
    public static void main(String[] args){
      int a = 1; 
      int b = 5; 
      if (a>=b){
        System.out.println("A is largest of 2"); 
      }else{
        System.out.println("B is largest of 2");
      }
    }
}
 */
// Odd Even Number: 
/*import java.util.*; 
 public class Conditional_statem {
     public static void main(String[] args){
      Scanner sc = new Scanner(System.in); 
      int n = sc.nextInt();
      
      if(n%2 == 0){
        System.out.println("EVEN");
      }else{
        System.out.println("Odd");
      }
    }
 }*/ 

//Income tax Calculator: 
/* 
import java.util.*; 
 public class Conditional_statem {
     public static void main(String[] args){
      Scanner sc = new Scanner(System.in); 
      int income = sc.nextInt(); 
      int tax; 

      if(income < 500000){
          tax = 0; 
      }
      else if(income >= 500000 && income < 1000000){
        tax = (int) (income * 0.2);  //typecasting  double data type convert into int 
      }else{
        tax = (int) (income * 0.3); 
      }
      System.out.println("your tax is: "+ tax);
    }
 }
*/

/*
 * import java.util.*; 
class Conditional_statem{
    public static void main(String[] args){
        int C = 1, B = 3, A = 6; 

        if((A>=B)&&(A>=C)){
            System.out.println("largest is A");
        }else if(B>=C){
            System.out.println("larges is B "); 
        }else{
            System.out.println("largest is c");
        }
    }
}
 */
// 4: Ternary Operator :  NB: page 12
/*
 *  import java.util.*; 
 class Conditional_statem{
     public static void main(String[] args){
         int number = 4; 
         //ternary operator ""
         String type =((number%2)==0)? "even": "odd"; 
         System.out.println(type);
     }
 }
 */
// reportCard Marks 
 /*
  * import java.util.*; 
 class Conditional_statem{
     public static void main(String[] args){
        int marks = 30;
        String reportCard = marks >= 33  ? "pass" : "fail"; 
        System.out.println("reportCard is : "+reportCard);
     }
 }
  */
//5:NB:12: Switch Statement((Like Buttons)):
// ex. 1
/*class Conditional_statem{
    public static void main(String[] args){
        int number = 4; 
        switch(number){
            case 1 : System.out.println("samosa");
                    break; 
            case 2 : System.out.println("burger");
                    break;
            case 3 : System.out.println("mango Shake");
                    break; 
            default : System.out.println("Sapna accha tha");
        }
    }
}
 */
/*
 *  import java.util.*; 
 class Conditional_statem{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in); 
       System.out.print("enter a: ");
       int a = sc.nextInt(); 
       System.out.print("enter operator: ");
       char operator = sc.next().charAt(0); 
       System.out.print("enter b: ");
       int b = sc.nextInt(); 
    //  
        switch(operator){
           case '+' : System.err.println(a+b); break; 
           case '-' : System.out.println(a-b); break; 
           case '/' : System.out.println(a/b); break; 
           case '*' : System.out.println(a*b); break; 
           case '%' : System.out.println(a%b); break; 
           default : System.err.println("does not exist operator");
           System.out.print("output is : ");
        }
        
    }
}
 */
/*  
 import java.util.*; 
 class Conditional_statem{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in); 
       int year = sc.nextInt(); 

      if(year%4==0||year%400==0 || year%100 == 0){
        System.out.println("year is leap year: ");
      }else{
        System.out.println("year is not leap year");
      }
        
    }
}
*/
