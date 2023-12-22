import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long K = sc.nextLong();

		System.out.print((A - K) < 0 ? "0" : (A - K));
		System.out.print(" ");
		if (A - K < 0) {
			System.out.println((B - (K - A)) < 0 ? "0" : (B - (K - A)));
		} else {
			System.out.println(B);
		}
	}
}