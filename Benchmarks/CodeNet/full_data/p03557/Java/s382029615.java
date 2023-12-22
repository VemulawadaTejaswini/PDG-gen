import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		for(int i = 0 ; i < n ; i++) b[i] = sc.nextInt();
		for(int i = 0 ; i < n ; i++) c[i] = sc.nextInt();
		long ans = 0;
		Arrays.sort(a);
		Arrays.sort(c);
		// 中段で全探索
		for(int i = 0 ; i < n ; i++) {
			// 上段と中段で比較 // a[i] < b を満たす最大のiを求める
			int l = -1;
			int r = n;
			while(r - l > 1) {
				int mid = (l + r) / 2;
				if(a[mid] < b[i]) l = mid;
				else r = mid;
			}
			int cnt1 = r;
			// 中段と下段を比較 // b >= c[i] を満たす最大のiを求める
			int l1 = -1;
			int r1 = n;
			while(r1 - l1 > 1) {
				int mid = (l1 + r1) / 2;
				if(b[i] >= c[mid]) l1 = mid;
				else r1 = mid;
			}
			int cnt2 = n - r1;
			ans += 1L * cnt1 * cnt2;
		}
		System.out.println(ans);
	}
}
