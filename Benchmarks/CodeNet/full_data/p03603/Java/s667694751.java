import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		if (n == 1) {
			int kara = Integer.parseInt(sc.next());
			System.out.println("POSSIBLE");
		} else {
			int[] p = new int[n];
			p[0] = Integer.MAX_VALUE;
			for (int i = 0; i < n - 1; i++) {
				p[i + 1] = Integer.parseInt(sc.next());
			}
			int[] x = new int[n];
			for (int i = 0; i < n; i++) {
				x[i] = Integer.parseInt(sc.next());
			}
			int[] dp = new int[n];
			Deque<node> node = new ArrayDeque<>();
			node.addFirst(new node(n - 1, 0));
			node tmps;
			int tmpp = n - 1;
			int ps, pe;
			int next;
			boolean flg = false;
			tansa: while (!node.isEmpty()) {
				tmps = node.removeFirst();
			//	System.out.println(tmps.id + "," + tmps.num);
				if (tmps.id == 0) {
					flg = true;
					break;
				}
				dp[tmps.id] = tmps.num;
				pe = Integer.MAX_VALUE;

				while (tmpp>0 && p[tmpp]  >= tmps.id ) {
					if (p[tmpp]  == tmps.id  && pe == Integer.MAX_VALUE) {
						pe = tmpp;
					}
					tmpp--;
				}
				if (pe == Integer.MAX_VALUE) {
					node.addFirst(new node(tmps.id - 1, 0));
			//		System.out.println("add " + (tmps.id - 1) + ",0," + x[tmps.id - 1]);
					continue;
				}
				ps = tmpp + 1;
			//	System.out.println("ps,pe "+ps+","+pe);
				next = x[tmps.id - 1];
				int big;
				int small;
				int[] dps = new int[next + 1];
				Arrays.fill(dps, Integer.MAX_VALUE);
				if (x[ps] <= next) {
					dps[x[ps]] = dp[ps];
				}
				if (dp[ps] <= next) {
					dps[dp[ps]] = x[ps];
				}
				for (int i = 1; i <= next; i++) {
					dps[i] = Math.min(dps[i], dps[i - 1]);
				}
				if(dps[next]==Integer.MAX_VALUE) {
					break tansa;
				}
				for (int i = 0; i < pe - ps; i++) {
					big = Math.max(x[ps + i + 1], dp[ps + i + 1]);
					small = Math.min(x[ps + i + 1], dp[ps + i + 1]);
				//	System.out.println("big,small "+big+","+small);
					for (int j = next; j >= 0; j--) {
						if (dps[j] == Integer.MAX_VALUE || j < small) {
							if (j == next) {
								break tansa;
							}
							dps[j] = Integer.MAX_VALUE;
							continue;
						}
						if (big <= j) {
							dps[j] =  Math.min(dps[j - big] + small,dps[j - small] + big);
							continue;
						}
						if (small <= j) {
							dps[j] = dps[j - small] + big;
							continue;
						}
					}
				}
				node.addFirst(new node(tmps.id - 1, dps[next]));
			//	System.out.println("add " + (tmps.id - 1) + "," + dps[next] + "," + x[tmps.id - 1]);

			}
			if (flg == true) {
				System.out.println("POSSIBLE");
			} else {
				System.out.println("IMPOSSIBLE");
			}
		}
	}

	static int nibun(int[] p, int n) {
		int cen;
		int l = 0;
		int r = p.length - 1;
		while (l != r) {
			cen = (l + r + 1) / 2;
			if (p[cen] > n) {
				r = cen - 1;
			} else {
				l = cen;
			}
		}
		return l;
	}
}

class node {
	int id;
	int num;

	node(int id, int num) {
		this.id = id;
		this.num = num;
	}
}