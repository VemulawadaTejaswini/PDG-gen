
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static long[] ans;
	public static List<Set<Integer>> tree;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		boolean[] root = new boolean[n];
		root[0] = true;
		for(int i = 1; i < n; i++) {
			root[i] = false;
		}
		tree = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			tree.add(new HashSet<>());
			tree.get(i).clear();
		}
		for(int i = 0; i < n - 1; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			if(root[a]) {
				tree.get(a).add(b);
				root[b] = true;
			} else if(root[b]) {
				tree.get(b).add(a);
				root[a] = true;
			}
		}
		ans = new long[n];
		for(int i = 0; i < n; i++) {
			ans[i] = 0;
		}
		for(int i = 0; i < q; i++) {
			int p = sc.nextInt() - 1;
			long x = sc.nextLong();
			Calc(p, x);
		}
		for(int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
	}

	public static void Calc(int p, long x) {
		ans[p] += x;
		for(Integer e : tree.get(p)) {
			Calc(e, x);
		}
	}

}
