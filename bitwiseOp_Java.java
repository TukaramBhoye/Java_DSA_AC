//20:NB:56: Bitwise Operator in Java 
/* 
//*Bitwise Operators : 
public class bitwiseOp_Java {
    public static void main(String[] args){
    
        //*  1: binary & operator : 
       System.out.println(5 & 6);  // 4: 

    //*   2:   binary OR |
        System.out.println(5 | 6); // op: 7: 

         //* 3:   binary ^ 
         System.out.println(5 ^ 6);

         //*  4: ~ : one's complement ~ 
        
        System.out.println(~5);

        //*  5: left shift a << b = a * 2 ^b : 
        System.out.println("left shift "+(5 << 2));

        //* 6: right shift: a >> b = a / 2 ^b  : short to execute answer
        System.out.println("right shift: "+(5 >> 2));
    }
}

Q.2: find the number is odd or even using bitwise operator : 

Decimal :	Binary : 
: 1	    :   0001   : 
: 2	    :   0010   : 
: 3	    :   0011   : 
: 4	    :   0100   : 
: 5	    :   0101   : 
: 6	    :   0110   : 
: 7	    :   0111   : 
: 8	    :   1000   : 
: 9	    :   1001   : 
: 10	:   1010   : 

for odd numbers  LSB Alwayas 1 : and for even 0 : 
*/ 
/* code : 
import java.util.*; 
public class bitwiseOp_Java {
    public static void oddEven(int n){
        int bitMask = 1; 

        if((n & bitMask) == 0){
            System.out.println(" even number ");
        }else {
            System.out.print("odd number");
        }
    }
    public static void main(String[] args){
        oddEven(3) ; 
        oddEven(4); 
    }
}
*/

/*  i: getIth Bit: n=10 binary = 1010   i = 2 
 bitmask(1) shift in 1010 of 2 th position 
*/ 
/* 
public class bitwiseOp_Java {
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;   // 10 = 1010 bitmask = 1000
        if((n & bitMask) == 0 ){
            return 0; 
         }else {
            return 1; 
         }
    }
    public static void main (String[] args){
       System.out.println(getIthBit(10, 3)); 
    }
};

*/ 
/*ii: setIthbit:  i = 2; n = 10;  
bitMask =  1<<i=> 0100   :   10 = 1010
          1101
    (or)| 0100
    ans-> 1101  =  
         8+4+0+1 = 13
*/ /*  
 public class bitwiseOp_Java{
    public static int setIthbit(int n, int i){
        int bitmask = 1<<i; 
        
        return n | bitmask; 
    }
    public static void main(String[] args){

       System.out.println(setIthbit(10, 2));;
    }
}
*/ 



/* 3: clear IthBit : i = 1; n = 10;  
bitMask =  ~(1<<i) => ~(1101)   :   10 = 1010
      1101
    & 1010
ans ->1000 = (8) */ /*
public class bitwiseOp_Java {
     
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i); 
        return n & bitMask; 
    }
    public static void main(String[] args){
        System.out.println(clearIthBit(10, 1));
    }
}
    */ 


// 4: Update Ith bit: 
/* 
public class bitwiseOp_Java {
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i); 
        return n & bitMask; 
    }
    public static int updateIthBit(int n, int i, int newBit ){
       if(newBit == 0){
        return clearIthBit(n, i); 
       }else{
        return setIthBit(n, i); 
       }


    }
    
    public static void main(String[] args){
                
    }
}
*/ 

// 5: Clear Range of bits : 
/* 
public class bitwiseOp_Java {
    public static int clearBitsInRange(int n, int i, int j){
        int a = ((~0) << (j+1)); 
        int b = (1 << i) - 1; 
        int bitMask = a | b; 
        return n & bitMask; 
    }
    public static void main(String[] args){
        System.out.println(clearBitsInRange(10, 2, 4));
    }
}
*/ 

// 6 : check if a number is a power of 2 or not : 
/* 
public class bitwiseOp_Java{

   public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0; 
   }
    public static void main(String[] args){
        System.out.println(isPowerOfTwo(15));
    }  
}
*/ 

// 7: Count Set Bits in a Number. 
/* 
public class bitwiseOp_Java {

    public static int countSetBits(int n){
        int count = 0; 
        while(n > 0){

            if((n & 1) != 0){// check our LSB 
                count++; 
            }
            n = n >> 1; 
        }

        return count; 
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(15));
    }
}

*/ 

// Q. 8 : Fast Exponentiation : 
/* 
public class bitwiseOp_Java {
    public static int fastExpo(int a, int n){
        int ans = 1; 

        while(n > 0){
            if((n & 1) != 0){
                ans = ans * a; 
            }
            a = a * a; 
            n = n >> 1; 
        }
        return ans; 
    }
    public static void main (String[] args){
           System.out.println(fastExpo(3, 5));
    }
}

*/ 

//-Assignment OF Bit Manupulation ----------------------------------------

// Question 1: What is the value of x^x for any value of x? 
/* 
public class bitwiseOp_Java {

    public static void main(String[] args){
        int x = 5; 

        x = x ^ x ; 

        System.out.println(x); 
    }
}*/ 

//Question 2 : Swap two numbers without using an y third ariable. 
/*
public class bitwiseOp_Java {

    public static void main(String[] args){
        int x = 3 ,  y = 4; 

        x = x ^ y ; 
        y = x ^ y ; 
        x = x ^ y ; 

        System.out.println(x+ " OR "+ y);
    }
}
*/ 
// Question 3: Add 1 to an integer using any third variable
/*
public class bitwiseOp_Java {

    public static void main(String[] args){
        int x = 6; 
        System.out.println(x + "  + "+ 1 + " is " + -~x);

        x = -4; 
        System.out.println(x + " + "+ 1 + " is " + -~x);

        x = 0; 
        System.out.println(x + "  + "+ 1 + " is " + -~x);


    }
}
*/ 
// Question 4 : Convert uppercase character to lowercase using bits.

public class bitwiseOp_Java {
    public static void main(String [] args){
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println((char)(ch | ' '));
            //
        }
    }
}