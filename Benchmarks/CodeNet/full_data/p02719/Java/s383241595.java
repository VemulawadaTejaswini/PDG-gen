import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		sc.close();
		long p = N / K;
		// System.out.println(p + " " + N);
		System.out.println(N % K == 0 ? 0 : p > 0 ? Math.min(p, N) : N);
	}
}