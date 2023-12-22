import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in); PrintWriter pw = new PrintWriter(System.out)) {
			int Q = Integer.parseInt(sc.nextLine());
			int[] l = new int[Q];
			int[] r = new int[Q];
			for (int i = 0; i < Q; i++) {
				l[i] = sc.nextInt();
				r[i] = sc.nextInt();
			}

			for (int i = 0; i < Q; i++) {
				int[] prime = new int[100_000];
				int x = 0;
				for (int n = l[i]; n <= r[i]; n += 2) {
					if (n == 1) {
						continue;
					}
					if (isPrime(n)) {
						prime[x++] = n;
					}
				}
				for (int n : prime) {
					if (isPrime((n + 1) / 2) == false) {
						x--;
					}
				}
				pw.println(x);
			}
			pw.flush();
		}
	}

	private static boolean isPrime(int n) {
		int i = 2;
		for (; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
