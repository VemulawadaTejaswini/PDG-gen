import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long N = scan.nextLong();
		long A = scan.nextLong();
		long B = scan.nextLong();

		if ((B - A) % 2 == 0) System.out.println(Math.min((B - A) / 2, Math.min(B - 1, N - A)));
		else System.out.println(Math.min(B - 1, N - A));
 	}
}