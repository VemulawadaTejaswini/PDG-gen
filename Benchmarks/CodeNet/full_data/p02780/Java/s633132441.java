import java.util.*;

public class Main {
	public static double sum(int p) {
		long ans = 0;
		ans = (long) p * (long) (p + 1);
		ans >>= 1;
		return (double) ans;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int p[] = new int[n];
		for (int i = 0; i < n; ++i)
			p[i] = sc.nextInt();
		sc.close();
		double e[] = new double[n + 1];
		for (int i = 1; i <= n; ++i) {
			int tmpp = p[i - 1];
			double tmp = sum(tmpp) / (double) tmpp;
			e[i] = e[i - 1] + tmp;
		}
		double ans = 0;
		for (int i = 0; i <= n - k; ++i) {
			double tmp = e[i + k] - e[i];
			ans = Math.max(ans, tmp);
		}
		System.out.println(ans);
	}
}
