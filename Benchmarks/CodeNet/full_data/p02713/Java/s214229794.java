import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var k = sc.nextInt();
		sc.close();

		var sum = 0L;
		for (var a = 0; a < k; a++) {
			for (var b = 0; b < k; b++) {
				for (var c = 0; c < k; c++) {
					sum += gcd(a + 1, b + 1, c + 1);
				}
			}
		}

		System.out.println(sum);
	}

	public static int gcd(int a, int b, int c) {
		return gcd(gcd(a, b), c);
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}

		return gcd(b, a % b);
	}
}