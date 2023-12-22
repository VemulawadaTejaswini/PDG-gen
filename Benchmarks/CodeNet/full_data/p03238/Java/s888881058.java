import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    	 Scanner sc = new Scanner(System.in);

         int N = sc.nextInt();

         int A = sc.nextInt();
         int B = sc.nextInt();
        
         
        String ans1 = "Hello World";
        int ans2 = A+B;
        
        if( N == 1){
        	System.out.print(ans1);
        } else {
        	System.out.print(ans2);
        }

        
        
        
    }
  }