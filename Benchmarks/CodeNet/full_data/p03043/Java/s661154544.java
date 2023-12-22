import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		int k = sc.nextInt();
		
		double sum = Math.max(n - k + 1, 0);
		for (int i = 1; i <= n && i < k; i++) {
			int score = i;
			double cnt = 0;
			while (score < k) {
				score *= 2;
				cnt++;
			}
			sum += 1.0 / Math.pow(2, cnt);
		}
		
		double ans = sum / n;
		System.out.printf("%.10f\n", ans);

	}
}
