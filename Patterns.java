// 12:NB:17: Patterns: 

// Q. 1 print Star Pattern : 
/*
public class Patterns{
	public static void main(String[] args){
		for(int line = 1; line<=4; line++){
			//one line
			for (int star = 1 ; star<=line; star++){
				System.out.print("*"); 
			}
			System.out.println(); 
		}
	}
}
*/ 

// Q. print inverted-Star Patterns : 
/* 
public class Patterns{
	public static void main(String[] args){

		int n = 5; 

		for(int i = 1; i<=n; i++){
			for(int j=1; j<=n-i+1; j++){
				System.out.print(" * "); 
              	      } 
			System.out.println(); 
		}
	}
} */
/* 
 * public class Patterns{
	public static void main(String[] args){

		int n = 5; 

		for(int line = 1; line<=n; line++){
			for(int number=1; number<=i; number++){
				System.out.print(j); 
              	} 
			System.out.println(); 
		}
	}
}

*/
/*
 * public class Patterns{
	public static void main(String[] args){
		char ch = 'A'; 
		int n = 5; 

		for(int line=1; line<=n; line++){
			for(int chars=1; chars<=line; chars++){
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
	}
}
 */

