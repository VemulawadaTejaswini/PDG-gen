import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    	 Scanner sc = new Scanner(System.in);

         int N = sc.nextInt();

         int A = sc.nextInt();
         int B = sc.nextInt();

         int [] array = {N,A,B};         

        String ans1 = "Hello World";

        if( array[0] == 1){
        	System.out.print(ans1);
        } else {
        	System.out.print(array[1] + array[2]);
        }




    }
  }