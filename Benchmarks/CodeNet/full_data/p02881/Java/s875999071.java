import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextLong();
			double sq = Math.sqrt((double) n);
			int sqrt = (int) sq;
			long ans = 1;

			for (int i = 2; i <= sqrt; i++) {
				if (n % i == 0) {
					ans = i;
				}
			}
			long other = n / ans;
			System.out.println((ans + other - 2));
		}
	}
}
