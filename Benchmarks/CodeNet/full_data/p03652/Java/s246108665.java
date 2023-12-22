import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int m = Integer.parseInt(sa[0]);
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			sa = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				a[i][j] = Integer.parseInt(sa[j]);
			}
		}
		br.close();

		int ans = 300;
		int[] idx = new int[n];
		Set<Integer> rem = new HashSet<>();
		for (int j = 0; j < m; j++) {
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < n; i++) {
				while (rem.contains(a[i][idx[i]])) {
					idx[i]++;
				}
				putCntMap(map, a[i][idx[i]]);
			}
			int max = 0;
			int num = 0;
			Integer[] arr = map.keySet().toArray(new Integer[0]);
			for (Integer i : arr) {
				int val = map.get(i);
				if (val > max) {
					max = val;
					num = i;
				}
			}
			ans = Math.min(ans, max);
			rem.add(num);
		}
		System.out.println(ans);
	}

	static void putCntMap(Map<Integer, Integer> map, Integer key) {
		if (map.containsKey(key)) {
			map.put(key, map.get(key) + 1);
		} else {
			map.put(key, 1);
		}
	}
}
