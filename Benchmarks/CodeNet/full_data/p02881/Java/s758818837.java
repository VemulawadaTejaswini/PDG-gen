import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();

		long a = (long) Math.sqrt(n);

		long ans = 0;
		for (long i = a; i >= 1; i--) {
			if (n % i == 0) {
				ans += i;
				ans += n / i;
				break;
			}
		}
		System.out.println(ans - 2);
	}
}