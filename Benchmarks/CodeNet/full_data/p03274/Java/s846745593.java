import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
		}
		int min = Integer.MAX_VALUE/10;

/*
		for (int i = 0; i <= n-k; i++) {
			if (x[i+k-1] < 0) {
				int ans = Math.abs(x[i]);
				if (ans < min) min = ans;
			}
			else if (x[i] < 0 && x[i+k-1] >= 0) {
				int ans1 = Math.abs(x[i])*2 + x[i+k-1];
				int ans2 = x[i+k-1]*2 + Math.abs(x[i]);
				int ans = Math.min(ans1, ans2);
				if (ans < min) min = ans;
			}
			else if (0 <= x[i]) {
				int ans = x[i+k-1];
				if (ans < min) min = ans;
			}
		}*/

		for (int i = 0; i <= n-k; i++) {
			int ans1 = Math.abs(x[i]) + Math.abs(x[i+k-1]-x[i]);
			int ans2 = Math.abs(x[i+k-1]) + Math.abs(x[i+k-1]-x[i]);
			int ans = Math.min(ans1, ans2);
			if (ans < min) min = ans;
		}
		System.out.println(min);
	}
}
