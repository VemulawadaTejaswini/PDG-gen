

import java.util.*;
import java.math.*;
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
	static final long mod = (int) (1e9 + 7);
	static final int inf = (int) (1e9);
	static final int maxn = (int) (1e5 + 10);

	static long ksm(long a, long b) {
		long ret = 1;
		while (b != 0) {
			if (b % 2 == 1) {
				ret = ret * a % mod;
			}
			b >>= 1;
			a = a * a % mod;
		}
		return ret;
	}

	static int n, q;
	static String s;
	static int sum[] = new int[maxn];

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		n = cin.nextInt();
		q = cin.nextInt();
		s = cin.next();
		for (int i = 1; i < n; i++) {
			sum[i+1] = sum[i];
			if (s.charAt(i) == 'C' && s.charAt(i - 1) == 'A') {
				sum[i+1]++;
			}
		}
		for (int i = 1; i <= q; i++) {
			int l = cin.nextInt(), r = cin.nextInt();
			int ans = sum[r] - sum[l];
			System.out.println(ans);
		}
	}
}