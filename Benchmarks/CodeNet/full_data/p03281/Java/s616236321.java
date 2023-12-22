import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1 && getDivisor(i) == 8) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static int getDivisor(int n) {
		int divisor = 0;
		int sqrt = (int) Math.sqrt(n);
		for (int i = 1; i <= sqrt && divisor <= 8; i++) {
			if (n % i == 0) {
				divisor += (i == sqrt) ? 1 : 2;
			}
		}
		return divisor;
	}
}