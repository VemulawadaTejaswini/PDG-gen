import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n+1];
		long[] b = new long[n];
		for(int i = 0; i <= n; i++) {
			a[i] = sc.nextLong();
		}
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextLong();
		}
		sc.close();
		long ans = 0;
		for(int i = 0; i < n; i++) {
			ans += Math.min(a[i], b[i]);
			ans += Math.min(a[i+1],Math.max(0, b[i]-a[i]));
			a[i+1] -= Math.min(a[i+1], Math.max(0, b[i]-a[i]));
		}
		System.out.println(ans);
	}
}