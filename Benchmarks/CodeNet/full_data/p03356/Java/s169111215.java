import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] p = new int[n];
		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt() - 1;
		}
		List<Set<Integer>> list = new ArrayList<Set<Integer>>();
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			int xi = -1;
			int yi = -1;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).contains(x)) {
					xi = j;
					break;
				}
			}
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).contains(y)) {
					yi = j;
					break;
				}
			}
			if (xi == -1) {
				if (yi == -1) {
					Set<Integer> set = new HashSet<Integer>();
					set.add(x);
					set.add(y);
					list.add(set);
				} else {
					list.get(yi).add(x);
				}
			} else {
				if (yi == -1) {
					list.get(xi).add(y);
				} else {
					list.get(xi).addAll(list.get(yi));
					list.remove(yi);
				}
			}
		}
		sc.close();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (p[i] == i) {
				ans++;
			} else {
				for (int j = 0; j < list.size(); j++) {
					if (list.get(j).contains(i) && list.get(j).contains(p[i])) {
						ans++;
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
