import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int n, h, a[][];
	
	public static boolean judge(int x) {
		long d = 0;
		int c = 0;
		for(int i = n - 1; i >= 0; --i) {
			if(a[1][i] >= a[0][n - 1]) {
				d += a[1][i];
				c++;
			}
			else break;
		}
		if(d >= h) {
			if(c <= x)
			return true;
			else return false;
		}
		if(c > x)return false;
		d += ((long)(a[0][n - 1]) * (long)(x - c));
		if(d < h)return false;
		return true;
	}
	
	public static int solve() {
		int l = 0, r = 1000000000;
		int mid = (r + l) /2;
		while(1 + l < r) {
			mid = (r + l) / 2;
			if(judge(mid))r = mid;
			else l = mid;
		}
		return r;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); h = sc.nextInt();
		a = new int[2][n];
		for(int i = 0; i < n; ++i) {
			a[0][i] = sc.nextInt();
			a[1][i] = sc.nextInt();
		}
		Arrays.sort(a[0]);
		Arrays.sort(a[1]);
		sc.close();
		int ans = solve();
		System.out.println(ans);
	}

}
