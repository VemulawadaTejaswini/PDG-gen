import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		double ans = 0;
		for (int i = 1; i <= N; i++) {
			int a = 0;
			int b = i;
			while (b < K) {
				a++;
				b = b * 2;
			}
			ans += (1 / N) * Math.pow(0.5, a);
		}
		System.out.println(ans);
	}
}
