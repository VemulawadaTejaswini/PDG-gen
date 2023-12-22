import java.util.Scanner;


public class Main {
	static int N,M;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			 N = sc.nextInt();
			 M= sc.nextInt();
		  sc.close();

		  long ans = 0 ;
		  ans = Math.abs((N-2)*(M-2));

		  System.out.println(ans);
	}
}