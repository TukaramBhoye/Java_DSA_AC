// Q.NB:29:Patterns 2

// Q.1
/*public class Patterns_p2 {
    public static void hollow_rectangle(int totRows, int totCols){
        for(int i=1; i<=totRows; i++){
            //inner  - columns 
            for(int j = 1; j<=totCols; j++){
                // ineer - columns: 
               if(i==1 || i==totRows || j==1 || j == totCols){
                    //boundry cells
                    System.out.print("*");                   
                }else{
                    System.out.print(" "); 
                }
            }
            System.out.println();
        }      
    }
    public static void main(String[] args){
        hollow_rectangle(5, 7); 
    }
} */

// Q.2 Inverted Hald Pyramid
/* 
public  class Patterns_p2{
    public static void inverted_half_pyramid(int n){
        for(int i = 1; i<=n; i++ ){
            for(int j = 1; j<=n-i; j++){
                System.out.print("-");
            }

            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        inverted_half_pyramid(10);  
    }
}
*/
// Q.3 Inverted Half pyramid: 
/*
 * public class Patterns_p2 {

    public static void inverted_half_pyramid2(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        inverted_half_pyramid2(5);
    }
}
 */
// Q.4:NB:30:  floy'ds triangle 
/* public class Patterns_p2 {

    public static void inverted_half_pyramid2(int n){
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++; 
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        inverted_half_pyramid2(5);
    }
} */
//Q.5: Zero - One Triangle 
/*public class Patterns_p2 {

    public static void zero_one_triangle(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        zero_one_triangle(5); 
    }
}*/

//Q: ButterFly : triangle : 
/*public class Patterns_p2 {

    public static void ButterFly(int n){
        for(int i=1; i<=n; i++){

            // stars 
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
                // spaces 2*(n-i )
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
                // star
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        ButterFly(5); 
    }
}*/

// Q.solid rhombos Pattern : 
/*public class Patterns_p2{
    public static void ButterFly(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("- ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        ButterFly(5); 
    }
}*/

public class Patterns_p2 {

    public static void hollow_rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                System.out.print("- ");
            }

            for(int j=1; j<=n; j++){
               if(i==1 || i==n || j==1|| j==n){
                System.out.print("*");
               }else{
                System.out.print(" ");
               }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        hollow_rhombus(5);
    }
}