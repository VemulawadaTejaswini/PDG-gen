import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] v1 = new int[n / 2], v2 = new int[n / 2];
		for (int i = 0; i < n / 2; i++) {
			v1[i] = in.nextInt();
			v2[i] = in.nextInt();
		}
		Map<Integer, Integer> m1 = collect(v1), m2 = collect(v2);
		int max1 = getMaxVal(m1), max2 = getMaxVal(m2);
		if (max1 != max2) {
			System.out.println(countChange(max1, m1) + countChange(max2, m2));
			return;
		}
		if (m1.get(max1) < m2.get(max2)) {
			int ans = countChange(max2, m2) + n / 2;
			if (1 < m1.size()) {
				ans -= countChange(getSecondVal(m1), m1);
			}
			System.out.println(ans);
		} else {
			int ans = countChange(max1, m1) + n / 2;
			if (1 < m2.size()) {
				ans -= countChange(getSecondVal(m2), m2);
			}
			System.out.println(ans);
		}
	}

	public static Map<Integer, Integer> collect(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int val : arr) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}
		return map;
	}

	public static int getMaxVal(Map<Integer, Integer> map) {
		int ans = -1;
		for (int val : map.keySet()) {
			if (ans == -1) {
				ans = val;
			} else if (map.get(ans) < map.get(val)) {
				ans = val;
			}
		}
		return ans;
	}

	public static int countChange(int max, Map<Integer, Integer> map) {
		int ans = 0;
		for (int val : map.keySet()) {
			if (max == val) {
				continue;
			}
			ans += map.get(val);
		}
		return ans;
	}

	public static int getSecondVal(Map<Integer, Integer> map) {
		int[] arr = new int[map.size()];
		int idx = 0;
		for (int val : map.keySet()) {
			arr[idx++] = map.get(val);
		}
		Arrays.sort(arr);
		int sec = arr[arr.length - 2];
		int ans = 0;
		for (int val : map.keySet()) {
			if (map.get(val) == sec) {
				ans = val;
			}
		}
		return ans;
	}
}