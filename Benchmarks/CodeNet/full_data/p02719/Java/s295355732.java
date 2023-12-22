import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		sc.close();
		long p = N % K;
		// System.out.println("p = " + p);
		// System.out.println("abs = " + Math.abs(p - K));
		// System.out.println(1000000000000000000L - 1);
		// 1000000000000000000 999999999999999999
		System.out.println(N % K == 0 ? 0 : Math.min(Math.min(p, Math.abs(p - K)), N));
	}
}