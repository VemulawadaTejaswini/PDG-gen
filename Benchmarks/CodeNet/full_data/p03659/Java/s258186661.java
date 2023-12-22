import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n + 1];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		// 累積和作成
		for(int i = 0 ; i < n ; i++) {
			b[i + 1] = a[i] + b[i];
		}
		int ans = Integer.MAX_VALUE;
		for(int i = 1 ; i < n ; i++) {
			int dis = Math.abs(b[i] - (b[n] - b[i]));
			ans = Math.min(ans, dis);
		}
		System.out.println(ans);
	}
}
