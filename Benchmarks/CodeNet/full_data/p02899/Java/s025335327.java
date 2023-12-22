

import java.math.*;
import java.util.*;
import javax.swing.Spring;

public class Main {
	final static int maxn = (int) (1e6 + 5);
	static int[] vis = new int[maxn];

	static int gcd(int a, int b) {/// 欧几里得辗转相除法
		return b == 0 ? a : gcd(b, a % b);
	}

	public static void sieve(int N) {
		for (int i = 0; i <= N; i++)
			vis[i] = 1;
		vis[0] = 0;
		vis[1] = 0;
		vis[2] = 1;
		for (int i = 2; i <= N; i++) {
			if (vis[i] == 1) {
				for (int j = 2 * i; j <= N; j += i) {
					vis[j] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
//		int[] book = new int[maxn];
		int[] a = new int[maxn];
		int[] b = new int[maxn];
		Scanner cin = new Scanner(System.in);
		HashMap  mp = new HashMap();
//		Map map = new HashMap();
//		Set<Character> s = new HashSet<>();
//		Set<Set<Character>> ss = new HashSet<>();
		// System.out.println(String2);
		// String String2 = cin.next();
//		char []a = String2.toCharArray();// 字符串拆分成数组
//		String s1 = cin.nextLine();/// 吃掉换行符
		int ans = 0;
		int n = cin.nextInt();
		for(int i = 1 ;i <= n;i++) {
			a[i] = cin.nextInt();///第i个人是第几个
			b[a[i]] = i;
		}
		for(int i = 1;i <= n;i++) {
			System.out.print(b[i] + " ");
		}
	}
}
