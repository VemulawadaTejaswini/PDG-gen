import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	int min;

	public void solve() {
		int n = in.nextInt();
		int[] a = new int[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			sum += a[i];
		}
		long t = a[0];
		sum -= a[0];
		long min = Math.abs(t - sum);
		for(int i = 1; i < n - 1; i++) {
			t += a[i];
			sum -= a[i];
			min = Math.min(min, Math.abs(t - sum));
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		new Main().solve();
	}
}