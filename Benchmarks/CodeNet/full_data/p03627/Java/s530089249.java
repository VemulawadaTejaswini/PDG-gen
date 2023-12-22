import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < n; i++) {
			addCntMap(map, a[i]);
		}

		long[] b = new long[2];
		int idx = 0;
		for (int k : map.descendingKeySet()) {
			int v = map.get(k);
			while (v >= 2 && idx < 2) {
				b[idx] = k;
				v -= 2;
				idx++;
			}
			if (idx == 2) {
				break;
			}
		}
		System.out.println(b[0] * b[1]);
	}

	static void addCntMap(Map<Integer, Integer> map, Integer key) {
		if (map.containsKey(key)) {
			map.put(key, map.get(key) + 1);
		} else {
			map.put(key, 1);
		}
	}
}
