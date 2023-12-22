import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double x = Math.max(n - k + 1, 0) / (double)n;
		double y = 0.0;
		for (int i = 1; i <= Math.min(k - 1, n); i++) {
			y += getRate(i, k);
		}
		y /= n;
		System.out.println(x + y);
	}
	
	static double getRate(int w, int k) {
		double ans = 1;
		while (w < k) {
			w *= 2;
			ans *= 0.5;
		}
		return ans;
	}
}
