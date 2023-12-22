import java.util.Scanner;

public class Main {

	public static void main(String... args) {

		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();

			long count = Long.MAX_VALUE;
			long m = n ^ (1 / 2);
			for (long i = 1; i <= m; i ++) {
				for (long j = i; j <= n; j++) {
					if (i * j == n && i + j < count) {
						count = i + j - 2;
					}
				}
			}
			System.out.println(count);
		}
	}
}
