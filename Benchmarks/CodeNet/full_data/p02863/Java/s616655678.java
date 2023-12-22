import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int t = Integer.parseInt(sa[1]);
		Obj[] arr = new Obj[n];
		for (int i = 0; i < arr.length; i++) {
			Obj o = new Obj();
			sa = br.readLine().split(" ");
			o.i = i;
			o.a = Integer.parseInt(sa[0]);
			o.b = Integer.parseInt(sa[1]);
			arr[i] = o;
		}
		br.close();

		Arrays.parallelSort(arr, (o1, o2) -> o2.b - o1.b);
		int[] dp = new int[t];
		List<Set<Integer>> list = new ArrayList<>(n);
		for (int i = 0; i < t; i++) {
			list.add(new HashSet<>());
		}
		for (int i = 0; i < n; i++) {
			int a = arr[i].a;
			int b = arr[i].b;
			for (int j = t - 1; j >= 0; j--) {
				if (j >= a) {
					if (dp[j] <= dp[j - a] + b) {
						dp[j] = dp[j - a] + b;
						list.get(j).clear();
						list.get(j).add(i);
					}
				}
			}
		}

		int w = t - 1;
		Set<Integer> set0 = list.get(t - 1);
		while (w > 0) {
			Set<Integer> set = list.get(w);
			set0.addAll(set);
			if (!set.isEmpty()) {
				Obj next = arr[set.iterator().next()];
				w -= next.a;
			} else {
				break;
			}
		}

		int ans = dp[t - 1];
		for (int j = 0; j < arr.length; j++) {
			Obj o = arr[j];
			if (!set0.contains(j)) {
				ans += o.b;
				break;
			}
		}
		System.out.println(ans);
	}

	static class Obj {
		int i, a, b;
	}
}
