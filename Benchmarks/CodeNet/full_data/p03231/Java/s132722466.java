import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		long N = sc.nextInt();
		long M = sc.nextInt();
		char[] S = sc.next().toCharArray();
		char[] T = sc.next().toCharArray();
		long gcd = gcd(N, M);
		for (int i = 0; i < gcd; i++) {
			if (S[(int)(i * N / gcd)] != T[(int)(i * M / gcd)]) {
				System.out.println(-1);
				return;
			}
		}
		long lcm = N / gcd * M;
		System.out.println(lcm);
	}

	static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
