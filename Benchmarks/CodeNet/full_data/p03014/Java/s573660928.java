import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		char[][] s = new char[h][w];
		for (int i = 0; i < h; i++) {
			s[i] = br.readLine().toCharArray();
		}
		br.close();

		List<TreeMap<Integer, Integer>> list1 = new ArrayList<TreeMap<Integer, Integer>>(h);
		for (int i = 0; i < h; i++) {
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
			int idx = 0;
			int cnt = 0;
			for (int j = 0; j < w; j++) {
				if (s[i][j] == '.') {
					cnt++;
				} else {
					map.put(idx, cnt);
					idx = j;
					cnt = 0;
				}
			}
			if (cnt > 0) {
				map.put(idx, cnt);
			}
			list1.add(map);
		}

		List<TreeMap<Integer, Integer>> list2 = new ArrayList<TreeMap<Integer, Integer>>(w);
		for (int j = 0; j < w; j++) {
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
			int idx = 0;
			int cnt = 0;
			for (int i = 0; i < h; i++) {
				if (s[i][j] == '.') {
					cnt++;
				} else {
					map.put(idx, cnt);
					idx = i;
					cnt = 0;
				}
			}
			if (cnt > 0) {
				map.put(idx, cnt);
			}
			list2.add(map);
		}

		int ans = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j] != '#') {
					TreeMap<Integer, Integer> map1 = list1.get(i);
					int v1 = map1.get(map1.floorKey(j));
					TreeMap<Integer, Integer> map2 = list2.get(j);
					int v2 = map2.get(map2.floorKey(i));
					int v = v1 + v2 - 1;
					ans = Math.max(ans, v);
				}
			}
		}
		System.out.println(ans);
	}
}
