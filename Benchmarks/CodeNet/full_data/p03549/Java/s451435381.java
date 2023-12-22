import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();

		double result = 0;
		int time = 100 * (n - m) + 1900 * m;
		double correctProb = Math.pow(0.5, m);
		for (int i = 0; i < 100000; i++) {
			result += time * (i + 1) * correctProb * Math.pow((1 - correctProb), i);
		}
		System.out.println((int)Math.round(result));
	}
}
