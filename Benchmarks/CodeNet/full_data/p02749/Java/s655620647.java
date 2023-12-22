import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		List<List<Integer>> list = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			list.add(new ArrayList<>());
		}
		for (int i = 0; i < n - 1; i++) {
			sa = br.readLine().split(" ");
			int a = Integer.parseInt(sa[0]) - 1;
			int b = Integer.parseInt(sa[1]) - 1;
			list.get(a).add(b);
			list.get(b).add(a);
		}
		br.close();

		int[] rem = new int[4];
		int n2 = n / 3;
		rem[1] = n2;
		rem[2] = n2;
		rem[3] = n2;
		int n3 = n % 3;
		if (n3 > 0) rem[1]++;
		if (n3 > 1) rem[2]++;

		int[] ans = new int[n];
		Queue<Integer> que = new ArrayDeque<>();
		que.add(0);
		ans[0] = 1;
		while (!que.isEmpty()) {
			int x = que.poll();
			for (int y : list.get(x)) {
				if (ans[y] == 0) {
					que.add(y);

					Queue<Integer> que2 = new ArrayDeque<>();
					que2.add(y);
					int[] dep = new int[n];
					dep[y] = 1;
					Set<Integer> set = new HashSet<>();
					while (!que2.isEmpty()) {
						int cur = que2.poll();
						if (set.size() == 3) {
							break;
						}
						for (int next : list.get(cur)) {
							if (dep[next] == 0 && ans[next] != 0) {
								dep[next] = dep[cur] + 1;
								if (dep[cur] == 3) {
									set.add(ans[next]);
								} else {
									que2.add(next);
								}
							}
						}
					}
					if (set.contains(1)) {
						if (set.contains(2)) {
							ans[y] = 3;
						} else {
							ans[y] = 2;
						}
					} else {
						ans[y] = 1;
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			if (rem[ans[i]] > 0) {
				rem[ans[i]]--;
				ans[i] = rem[ans[i]] * 3 + ans[i];
			} else {
				ans[i] = rem[3] * 3;
				rem[3]--;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(ans[i]).append(' ');
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
	}
}
