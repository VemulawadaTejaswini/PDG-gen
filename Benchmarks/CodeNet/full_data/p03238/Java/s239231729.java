import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    	 Scanner sc = new Scanner(System.in);

         int N = sc.nextInt();
         String ans1 = "Hello World";

         int n1 = 1;

          
        if( N == n1){
        	System.out.print(ans1);
        	break;
        }

        int A = sc.nextInt();
        int B = sc.nextInt();

        if ((A == 0) | (B == 0)){
        	break;
        } else {
        System.out.print(A+B);
        }
    }
  }