import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>(new Comparator<Integer>() {
			public int compare(Integer m, Integer n) {
				return ((Integer) m).compareTo(n) * -1;
			}
		});

		String str[] = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(str[i]);
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}

		int count = 0;
		int i = map.size();
		for (int key : map.keySet()) {
			if (k >= i) {
				break;
			}
			count += map.get(key);
			i--;
		}
		System.out.println(count);
	}
}