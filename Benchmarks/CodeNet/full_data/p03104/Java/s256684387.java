import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		long ans = func(a - 1) ^ func(b);

		System.out.println(ans);

		sc.close();
	}

	public static long func(long n) {
		if (n <= 0)
			return 0;
		if (n % 2 == 0) {
			return n ^ (n % 4 == 0 ? 0 : 1);
		} else {
			return (n + 1) % 4 == 0 ? 0 : 1;
		}
	}

}
