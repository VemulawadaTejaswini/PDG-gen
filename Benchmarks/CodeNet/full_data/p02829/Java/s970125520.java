import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
      
       if (N != 1 && M != 1) {
       	  System.out.print(1);
       } else if (N != 2 && M != 2) {
       	  System.out.print(2);
       } else if (N != 3 && M != 3) {
       	  System.out.print(3);
       }
	
	return;

	}
}