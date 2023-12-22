import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		int[] groups = new int[n];
		int[] counts = new int[n];
		HashMap<Integer, HashSet> map = new HashMap<Integer, HashSet>();
		int groupCount = 0;
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ga = groups[a - 1];
			int gb = groups[b - 1];
			if (ga == 0 && gb == 0) {
				groupCount++;
				groups[a - 1] = groupCount;
				groups[b - 1] = groupCount;
				HashSet set = new HashSet();
				set.add(a);
				set.add(b);
				map.put(groupCount, set);
			} else if (groups[a - 1] == 0) {
				groups[a - 1] = gb;
				map.get(gb).add(a);
			} else if (groups[b - 1] == 0) {
				groups[b - 1] = ga;
				map.get(ga).add(b);
			} else if (ga != gb) {
				for (Object x : map.get(gb)) {
					groups[(int)x - 1] = ga;
				}
				map.get(ga).addAll(map.get(gb));
				map.remove(gb);
			}
			counts[a - 1]++;
			counts[b - 1]++;
		}

		for (int i = 0; i < k; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			if (groups[c - 1] == groups[d - 1]) {
				counts[c - 1]++;
				counts[d - 1]++;
			}
		}
		sc.close();

		int[] gc = new int[groupCount];
		for (int i = 0; i < n; i++) {
			if (groups[i] != 0) {
				gc[groups[i] - 1]++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int result = 0;
			if (groups[i] != 0) {
				result += (gc[groups[i] - 1] - 1 - counts[i]);
			}
			sb.append(i == 0 ? "" : " ");
			sb.append(result);
		}
		System.out.print(sb.toString());
	}
}
