import java.util.*;

public class Main {
	void solve() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n + 1];
		int[] b = new int[n];
		long before = 0;
		for(int i = 0; i < n + 1; i++) {
			a[i] = scan.nextInt();
			before += a[i];
		}
		for(int i = 0; i < n; i++) b[i] = scan.nextInt();
		long after = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] <= b[i]) {
				b[i] -= a[i];
				a[i] = 0;
				a[i + 1] -= b[i] - a[i];
				if(a[i + 1] < 0) a[i + 1] = 0;
			} else {
				a[i] -= b[i];
				b[i] = 0;
			}
		}
		for(int i = 0; i < n + 1; i++) {
			a[i] = Math.max(a[i], 0);
			after += a[i];
		}
		System.out.println(before - after);
		scan.close();
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}
}
