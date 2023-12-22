import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner	sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n + 2];
		for(int i = 1 ; i <= n ; i++) a[i] = sc.nextInt();
		int d = 0;
		for(int i = 1 ; i <= n + 1 ; i++) {
			d += Math.abs(a[i] - a[i - 1]);
		}
		for(int i = 1 ; i <= n ; i++) {
			int ans = d;
			ans -= Math.abs(a[i] - a[i - 1]) + Math.abs(a[i] - a[i + 1]);
			ans += Math.abs(a[i + 1] - a[i - 1]);
			System.out.println(ans);
		}
	}
}
