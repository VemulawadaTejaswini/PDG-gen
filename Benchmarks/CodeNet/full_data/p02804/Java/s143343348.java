import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) A[i] = sc.nextLong();
		sc.close();
 
   		BiPredicate<int[], Integer> exist = (a, n) -> {
			for (int i = 0; i < a.length; i++) if (a[i] == n) return true;
			return false;
		};
 
		BiFunction<int[], Integer, Boolean> next_perm = (a, r) -> {
			if (a[0] == 0) {
				for (int i = 0; i < a.length; i++) a[i] = i + 1;
				return true;
			}
 
			int n = a.length;
			for (int i = n - 1; -1 < i; i--) {
				int b = 0;
                int j = a[i] + 1;
              if (j < r + 1 - (n - 1 - i)) b = j;
/*
				for (int j = a[i - 1] + 1; j < r + 1; j++) {
					if (!exist.test(a, j)) {
						a[i] = j;
						break;
					}
				}
*/
				a[i] = b;
				if (a[i] != 0) break;
			}
			if (a[0] == 0) return false;
			for (int i = 0; i < n; i++) {
				if (a[i] != 0) continue;
				for (int j = a[i - 1] + 1; j < r + 1; j++) {
					if (!exist.test(a, j)) {
						a[i] = j;
						break;
					}
				}
			}
			return true;
		};
 
		long mod = 1000000007L;
	    long ans = 0;
 
		int[] a = new int[K];
		while (next_perm.apply(a, N)) {
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			for (int i = 0; i < K; i++) {
				max = Math.max(max, A[a[i] - 1]);
				min = Math.min(min, A[a[i] - 1]);
			}
			long f = max - min;
			ans += f;
			ans %= mod;
		}
	    System.out.println(ans);
	}
}