import java.util.*;

// ABC 46-C
// http://abc047.contest.atcoder.jp/tasks/arc063_a

public class Main {
	
	static int MOD = 1000000007;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] t = new int[n];
		int[] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			t[i] = in.nextInt();
			a[i] = in.nextInt();
		}
		
		long tt = t[0];
		long aa = a[0];
		long base = 1;
		
		for (int i = 1; i < n; i++) {
			while (1 < base && tt <= (base - 1) * t[i] && aa <= (base - 1) * a[i]) {
				base--;
			}
			while (base * t[i] < tt || base * a[i] < aa) {
				base++;
			}
			tt = base * t[i];
			aa = base * a[i];
		}
		
		System.out.println(base * t[n - 1] + base * a[n - 1]);
	}
}