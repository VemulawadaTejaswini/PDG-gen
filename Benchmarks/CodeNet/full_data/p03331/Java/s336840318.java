import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = Integer.MAX_VALUE;
		for (int i = 1; i <= N / 2; i++) {
			int a = i;
			int b = N - i;
			int sum = calcEachDigit(a) + calcEachDigit(b);
			ans = Math.min(ans, sum);

		}
		System.out.println(ans);
		sc.close();
	}

	private static int calcEachDigit(int x) {
		int t = x;
		int sum = 0;
		while (t > 0) {
			sum += t % 10;
			t /= 10;
		}
		return sum;
	}
}