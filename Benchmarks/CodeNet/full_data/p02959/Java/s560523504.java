import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n];
		for(int i = 0; i <= n; i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();
		long ans = 0;
		for(int i = 0; i < n; i++) {
			ans += Math.min(a[i], b[i]);
			ans += Math.min(a[i+1],Math.max(0, b[i]-a[i]));
		}
		System.out.println(ans);
	}
}