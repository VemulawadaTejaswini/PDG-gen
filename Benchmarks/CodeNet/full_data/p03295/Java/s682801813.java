import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n + 1];
		Arrays.fill(a, n + 1);
		int idx, b, cnt = 0;
		for(int i = 0; i < m; i++) {
			idx = sc.nextInt();
			b = sc.nextInt();
			if(a[idx] > b) a[idx] = b;
		}
		for(int i = 1; i <= n; i++) {
			if(a[i] <= n) {
				BreakBridge(a, i, a[i], n + 1);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	static void BreakBridge(int[] a, int l, int r, int max){
		for(int i = l + 1; i < r; i++) {
			if(a[i] < max) {
				BreakBridge(a, i, a[i], max);
				break;
			}
		}
		a[l] = max;
	}
}