import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Long N = sc.nextLong();

		Long sum = (long)0;

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				long tmp = gcd(i,j);
				for (int k = 1; k <= N; k++) {
					sum += gcd(tmp,k);
				}
			}
		}

		System.out.println(sum);
		sc.close();
	}

	private static long gcd(long m, long n) {
		if (m < n)
			return gcd(n, m);
		if (n == 0)
			return m;
		return gcd(n, m % n);
	}

}