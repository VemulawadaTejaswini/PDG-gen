import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    	 Scanner sc = new Scanner(System.in);

         int N = sc.nextInt();

         int A = sc.nextInt();
         int B = sc.nextInt();
        
        String ans = "Hello World";
        
        if( N == 1){
        	System.out.print(ans);
        } else {
        	System.out.print(A+B);
        }

        
        
        
    }
  }