import java.util.Scanner;

public class Main {
	final static int MAX_N = 100010;
	static int[] par = new int[MAX_N];
	static int[] rank = new int[MAX_N];

	static int[] nums;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = sc.nextInt()-1;
		}
		init(n);
		for(int i = 0; i < m; i++) {
			unite(sc.nextInt()-1, sc.nextInt()-1);
		}
		long ans = 0L;
		for(int i = 0; i < n; i++) {
			if(root(i)==root(nums[i])) {
				ans++;
			}
		}
		System.out.println(ans);
	}

	static void init(int n) {
		for(int i = 0; i < n; i++) {
			par[i] = i;
			rank[i] = 0;
		}
	}
	static int root(int x) {
		if(par[x]==x) {
			return x;
		} else {
			return par[x] = root(par[x]);
		}
	}
	static boolean same(int x, int y) {
		return root(x)==root(y);
	}
	static void unite(int x, int y) {
		x = root(x);
		y = root(y);
		if(x == y) return;

		if(rank[x] < rank[y]) {
			par[x] = y;
		} else {
			par[y] = x;
			if(rank[x]==rank[y]) rank[x]++;
		}
	}
}