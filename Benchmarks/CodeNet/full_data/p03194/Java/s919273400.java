import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static long N = sc.nextLong();
	static long P = sc.nextLong();
	public static void main(String[] args) {
		long ans = 1;
		long i = 2;
		out: while (i <= P) {
			long p = P;
			for (long j = 0; j < N; j++) {
				if (p%i != 0) {
					p = P;
					i++;
					continue out;
				}
				p /= i;
			}
			ans *= i;
			P = p;
		}
		System.out.println(ans);
	}
}
