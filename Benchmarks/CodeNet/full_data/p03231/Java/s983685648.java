

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		String S = scan.next();
		String T = scan.next();

		if (S.charAt(0) != T.charAt(0)) {
			System.out.println(-1);
			return;
		}

		int g = gcd(N, M);
		if (g == 1) {
			System.out.println((long) M * N / g);
		} else {
			int n = N / g;
			int m = M / g;
			//System.out.println(S.charAt(m));
			//System.out.println(T.charAt(n));
			int i = 1;
			while (n < N && m < M) {
				if (S.charAt(n) != T.charAt(m)) {
					System.out.println(-1);
					return;
				}
				i++;
				n = (N / g) * i;
				m = (M / g) * i;
			}
			System.out.println((long) M * N / g);

		}

	}

	private static int gcd(int n, int m) {
		int r;
		while ((r = n % m) != 0) {
			n = m;
			m = r;
		}
		return m;
	}
}
