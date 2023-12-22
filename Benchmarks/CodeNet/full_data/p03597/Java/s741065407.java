import java.util.Scanner;

public class Main{
	public static void main(String args[]){
    	
      Scanner scan = new Scanner(System.in);
      int N = scan.nextInt();
      int A = scan.nextInt();
      N = N * N;
      System.out.print( N -A );
    }
}