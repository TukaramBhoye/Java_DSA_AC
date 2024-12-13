//23:NB:83:Recursion

/* Question 11:  The given 2*n board and tiles of size count the number of ways. to tile the given 
 * board using the  2 * 1 tiles. 
 * (A tile can either be placed horizontal or vertically)
*//* 
public class Recursion_2 {
    public static int tilingProble(int n){ // 2 * n (floor size)
        // Kamm 
        //Vertical choice 
        if(n == 0 || n == 1){
            return 1; 
        }
        int fnm1 = tilingProble(n-1);  

        //Horizonatal Choice 
        int fnm2 = tilingProble(n-2); 

        int totalWays = fnm1 + fnm2; 
        return totalWays; 
    }

    public static void main(String[] args) {
        System.out.println(tilingProble(3));  

    }
}
*/  
/*Question 12: Remove Duplicates Of a String */
/* 
public class Recursion_2 {
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if (idx == str.length()){
            System.out.println(newStr);
            return; 
        }

        // Kaam 
        char currChar = str.charAt(idx); 
        if(map[currChar-'a'] == true){
                //duplicate 
                removeDuplicates(str, idx+1, newStr, map); 
        }else{
            map[currChar - 'a']= true; 
            removeDuplicates(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollage";

        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]); 
    }
}
*/ 


/*Question 13: Friends Pairing  
- Given n friends, each one can remain single or can be paired up with some other friend. 
Each friend can be paired only once. find out the total number of ways in which 
friends can remain single or can be paired up.
*/ 
/* 
public class Recursion_2 {
    public static int friendsPairing(int n){
        if(n == 1 || n == 2){
            return n; 
        }
        // choice 
        //single
        // int fnm1 = friendsPairing(n-1);

        // //pair
        // int fnm2 = friendsPairing(n-2); 
        // int pairWays = (n-1) * fnm2; 

        // // totWays 
        // int totWays = fnm1 + fnm2 * pairWays; 
        
        // return totWays; 

        return friendsPairing(n-1) + (n-1) *  friendsPairing(n-2); 

    }
    public static void main(String[] args) {
      System.out.println(friendsPairing(3));
    }
}*/ 


/*Question 14: Binary String Problem 
- Prints All Binary String of Size N Without Consecutive Once. 
*/
/* 

public class Recursion_2 {
    public static void PrintBinString(int n, int lastPlace, String str){
       if(n == 0){
            System.out.println(str);
            return ; 
       }
       
        // if(lastPlace == 0){
        //      PrintBinString(n-1, 0, str.append("0")); 
        //      PrintBinString(n-1, 1, str.append("1")); 
        // }else{
        //      PrintBinString(n-1, 0, str.append("0")); 
        // }

        PrintBinString(n-1, 0, str+"0"); 
        if(lastPlace == 0) {
            PrintBinString(n-1, 1, str+"1"); 
        }
    }
    public static void main(String[] args) {
         
         PrintBinString(3, 0, "");
    }
}*/ 

//-ASSIGNMENTS -------------------------------------------------------
// Question 1 : for a Ginven Int Array of n Find all Occurances(indices of a given element and print them.)
/* 
public class Recursion_2 {

    public static void allOccurances(int arr[], int key, int idx){
        int count = 0; 
        if(idx == arr.length){
            return; 
        }

        if (arr[idx] == key){
            System.out.print( idx + " ");
        }
        
        allOccurances(arr, key, idx + 1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2}; 

        allOccurances(arr, 2, 0);

        System.out.println();
    }
}
    */ 


/*  Question 2:  You are given a number (eg - 2019), convert it into a String of english 
like "two zero one nine" use a recursive function to solve this Proble. 
*/
/* 
public class Recursion_2 {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void convertDigit(int number){
        if(number == 0){
            return ; 
        }
        if(number == 0){
            return; 
        }

        int lastDigit = number % 10 ;
        convertDigit(number/10); 
        
        System.out.println(digits[lastDigit]+" ");

    }
    public static void main(String[] args) {
        convertDigit(183942784);
    }
}*/ 


/* Question 3: We are Given a String S, we need to find the count of all contigous
substrings starting and ending with the same character. 

*/ 
/* 
public class Recursion_2 {

    public static int countSubstr(String str, int i, int j, int n){
        if( n == 1){
            return 1; 
        }

        // if str not Valid : 
       if(n <= 0){
         return 0; 
       }

       int res = countSubstr(str, i+1, j, n-1) + 
                 countSubstr(str, i, j-1, n-1) - 
                 countSubstr(str, i+1, j-1, n-2); 

        if(str.charAt(i) == str.charAt(j)){
            res++; 
        }
        return res; 
    }

    public static void main(String[] args){
        String str = "abcab"; 
        int n = str.length(); 
        System.out.print(countSubstr(str, 0, n-1, n));
    }
}*/ 

// Question 5: Tower Of Hanoi 
/* 
public class Recursion_2 {
    public static void toweHanoi(int n, String src, String helper, String dest){
        
        if(n == 1){
            System.out.println("transfer disk "+ n +" from "+src+" to "+dest );
            return ; 
        }

        toweHanoi(n-1, src, dest, helper);
        System.out.println("transfer dist " + n + " from "+src+" to "+ dest);
        toweHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 3; 

        toweHanoi(n, "S", "H", "D");
    }
}
    */ 


