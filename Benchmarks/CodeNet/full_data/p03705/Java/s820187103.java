import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();

		if (a > b) {
			System.out.println(0);
			return;
		}
		if (a < b && n == 1) {
			System.out.println(0);
			return;
		}
		long max = a + (n - 1) * b;
		long min = a * (n - 1) + b;
		System.out.println(max - min + 1);
	}
}
