import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
		sc.close();

		int ans = 0;
		for (int n = 1; n <= N; n++) {
			if (A <= sumDigits(n) && sumDigits(n) <= B) {
				ans += n;
			}
		}
		System.out.println(ans);
	}

	public static int sumDigits(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}
}
