import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= n; i += 2) {
			if (getDivisor(i) == 8) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static int getDivisor(int i) {
		int divisor = 0;
		int sqrt = (int) Math.sqrt(i);
		for (int j = 1; j <= sqrt; j++) {
			if (i % j == 0) {
				divisor += (j * j == i) ? 1 : 2;
			}
		}
		return divisor;
	}
}