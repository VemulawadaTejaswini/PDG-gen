import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int now, ans;
		for (int i = 0; i < n; i++) {
			ans = 0;
			now = 0;
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				}
				ans += Math.abs(now - a[j]);
				now = a[j];
			}
			ans += Math.abs(now);
			sb.append(ans + "\n");
		}
		System.out.println(sb);
	}
}