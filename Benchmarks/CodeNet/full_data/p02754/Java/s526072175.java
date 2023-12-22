import java.util.Scanner;

public class Main {

	public static int a = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		long A = scan.nextLong();
		long B = scan.nextLong();
		long q = N % (A + B);
		long r = N - q * (A + B);
		if(r <= A) {
		    System.out.println(r + A * q);
		}
		else {
		    System.out.println(A * (q + 1));
		}
	}

}