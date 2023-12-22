import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();

		double ans = 0;
		for (int i = 1; i <= n; i++) {
			int s = i;
			double val = 1.0 / n;
			while (s < k) {
				s *= 2;
				val /= 2;
			}
			ans += val;
		}
		System.out.println(ans);
	}
}
