
//19:NB:49: Strings in Java :
import java.util.*;
/*
public class Strings_java {
    public static void main(String[] args){
  
        char arr[] = {'a', 'b', 'c', 'd'}; 
        String str = "abcd";  // "as12378434@#$3"---> valid any char in string
        String str2 = new String("xyz"); 
        // java Strings are immutable.
  
    //-2: -input in string: -------------------------------------
         Scanner sc = new Scanner(System.in); 
  
        String st = sc.next(); // take just first word
        String st1 = sc.nextLine(); // take all line of which are in String: 
        // System.out.println(st);
        System.out.println(st1);
    
    //3: -string function :----------------------------------------
        String  fullName = "Tony Stark"; 
        System.out.println(fullName.length());
        // op: length: 10

    
     //4: concatenation ----------------------------

     String firstName = "Tukaram"; 
     String lastName = "Bhoye"; 
     String fName = firstName + " "+ lastName; 

     System.out.println(fName + " is this ");
     
     // print index chars 
     System.out.println(fullName.charAt(0));

     // to print all string letters : 

     for(int i=0; i<fullName.length(); i++){
        System.out.print(fullName.charAt(i) + " ");
     }
      
    }
}
*/

// Question 1: Check if a String is a Palindrome(same with both side) : 
//ex: "Racecar", "noon", "madam";
/* 
public class Strings_java {

    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length(); 
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false; 
            }
            
        }
        return true ; 
    }
    public static void main(String[] args){
        String str = "racecar"; 
       System.out.println( isPalindrome(str));
    }
}
*/

/*Question 2 : Given a route containing 4 directions(East, west, north, south)
 * find the shortest path to reach destination. 
 * "WNEENESENNN"
*//* 
   import java.util.*; 
   public class Strings_java {
     public static float  FindShortestPath(String path){
         int x = 0; int y = 0; 
   
         for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i); 
             // south 
            if(dir == 'S') {
                 y--; 
             }
   
             // North
             else if(dir == 'N'){
                 y++; 
             }
             //west
             else if(dir == 'W'){
                 x--; 
             }
             // east 
             else{
                 x++; 
             }
         }
         int X2 = x * x;  // sq: 
         int Y2 = y * y; 
     
   
         return (float)Math.sqrt(X2 + Y2); 
     }
     public static void main(String[] args){
         String path = "WNEENESENNN";
   
        System.out.println(FindShortestPath(path));
     }
   }*/

/*question 3: String Comparison: is differet not work in each case 
 * Ex: 
 */
/* 
public class Strings_java {

    public static void main(String[] args){
        String str1 = "Tony"; 
        String str2 = "Tony"; 
        String str3 = new String("Tony"); 

        if(str1 == str2){
            System.out.println("String are equal");
        }else{
            System.out.println("not equal");
        }

        if(str1 == str3){
            System.out.println("String are equal");
        }else{
            System.out.println("not equal");
        }

        // use equal function to compare string both 

        if(str1.equals(str3)){
            System.out.println("String are equal");
        }else{
            System.out.println("not equal");
        }

    }
}
*/

// 4: String Functions : Substring
/*  
public class Strings_java {
        public static String subString(String str, int si, int ei){
            String substr = ""; 
            for(int i = si; i < ei; i++){
                substr += str.charAt(i); 
            }
            return substr; 
        }
    public static void main(String[] args){
        String str = "helloWorld"; 
        // with inbuilt function: 
        System.out.println(str.substring(0, 5));  

        // without inBuilt 

       String str2 = subString(str, 0, 5);
       System.out.println(str2);
        
    }
}
    */

// Q.3 : for a given of String print the largest String--->(Lexicographically) 
// lexicographically : small word of ex. m > a , b > a
/*
public class Strings_java {
    public static void main(String[] args){
        String fruits[] = {"apple", "mango", "banana"};
        
        String largest = fruits[0]; 
        for(int i=1; i<fruits.length; i++ ){
            if(largest.compareTo(fruits[i]) < 0){
               largest = fruits[i];  
            }
        }
        System.out.println("Lexicographically largest is : "+largest);
    }
}
    */

// Q.4: StringBuilder : optimize 
/*
import java.util.*;

public class Strings_java {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);  
        }//abcdefghijklmnopqrstuvwxyz
        // O(26)
        //O(26 * n^2) : without this function 

        System.out.println(sb.length());
        System.out.println(sb);
    }
}
*/ 
//Q.5:  For a Given String convert each the first letter of each word to uppercase: 
/*
public class Strings_java {
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder(""); 

        char ch = Character.toUpperCase(str.charAt(0)); 
        sb.append(ch); 

        for(int i=1; i<str.length(); i++){ // start with 1 bcz 0 already check 
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i)); 
                i++; 
                sb.append(Character.toUpperCase(str.charAt(i))); 
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString(); 
    }
    public static void main(String[] args){ 
      
        String str = "hi, i am tukram";

        System.out.println(toUpperCase(str));
        
    }
}*/ 

// Q.6: String Compression : 
// "aaabbcccdd"  ans: "a3b2c3d2"  agar : abc hota to-> ans : abc
/* 
public class Strings_java {
    public static String compress(String str){
        String newStr = ""; 

        for(int i=0; i<str.length(); i++){ // out
            Integer count = 1; 
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++; 
                i++; 
            }
            newStr += str.charAt(i); 
            if(count > 1){
                newStr += count.toString(); 
            }
        }

        return newStr; 
    }
    public static void main(String[] args){
        String str = "aaabbcccdd"; 

        System.out.println(compress(str));
    }
}

*/ 

/* Question 1: Count how many times lowercase vowels occured in a String entered 
by the user. */ 
/* 
public class Strings_java {
    public static int countString(String str){
        int count = 0; 
        
        for(int i= 0; i<str.length(); i++){
            char ch = str.charAt(i); 
            if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u' && ch == 'A' ){
                count++; 
            }
        }
        return count; 
    }
    public static void main(String[] args){
       String str  = "TukaramBhoye" ; 

        System.out.println("count of vowels is : "+countString(str));
    }
}
*/ 

// Question2 : What will be the output of the following code? 
/*
public class Strings_java {

    public static void main(String[] args){
        String str = "ShradhaDidi"; 
        String str1 = "ApnaCollage"; 
        String str2 = "ShradhaDidi"; 

        System.out.println(str.equals(str1) + " " + str.equals(str2));
        System.out.println("1: ans :false : 2: ans : true");
    }
    
}*/  

// Question 3: what will be the output of the following code? 

/* 
public class Strings_java {
    public static void main(String[] args) {
        String str = "ApnaCollage".replace("l", "");
      
        System.out.println(str);
    }
}
*/ 

/*Question 4: Determine if 2 Strings are anagrams of each other.
If two string contain the same characters but in a different order, 
they can anagrams Consider "race" and "care". 
*/  
import java.util.Arrays; 
public class Strings_java {

    public static void main(String[] args){
        String str1 = "care"; 
        String str2 = "race"; 

        str1 = str1.toLowerCase(); // both str convert lowercase
        str2 = str2.toLowerCase(); 

        if(str1.length() == str2.length()){
            char str1CharArray[] = str1.toCharArray(); 
            char str2CharArray[] = str2.toCharArray(); 

            Arrays.sort(str1CharArray); 
            Arrays.sort(str2CharArray); 

            boolean result = Arrays.equals(str1CharArray, str2CharArray); 
          
            if(result) {
                System.out.println(str1 + " and "+ str2 + " are anagrams of each other.");
            }else{
                System.out.println("String is not anagram");
            }

        }else{
            System.out.println("Length is not equal");

        }
    }
}
