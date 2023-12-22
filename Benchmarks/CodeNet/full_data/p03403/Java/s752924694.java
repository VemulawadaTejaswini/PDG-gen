import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n + 2];
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 1; i <= n + 1; i++) {
			sum += Math.abs(a[i] - a[i - 1]);
		}
		int ans = 0;
		for (int i = 1; i < n + 1; i++) {
			ans = sum + Math.abs(a[i + 1] - a[i - 1])
					- (Math.abs(a[i - 1] - a[i]) + Math.abs(a[i] - a[i + 1]));
			sb.append(ans + "\n");
		}
		System.out.println(sb);
	}
}