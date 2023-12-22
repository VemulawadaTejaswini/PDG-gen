import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		Map<Integer, Long> map = new TreeMap<>();

		str = br.readLine().split(" ");

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(str[i]);
			if (map.containsKey(a))
				map.put(a, map.get(a) + 1);
			else
				map.put(a, 1L);
		}

		for (int i = 0; i < m; i++) {
			str = br.readLine().split(" ");

			long b = Long.parseLong(str[0]);
			int c = Integer.parseInt(str[1]);

			if (!map.containsKey(c))
				map.put(c, 0L);

			for (int k : map.keySet()) {
				if (k < c && map.get(k) > 0) {
					int count = 0;
					for (int j = 0; j < b; j++) {
						if (map.get(k) > 0) {
							map.put(k, map.get(k) - 1);
							map.put(c, map.get(c) + 1);
						} else {
							break;
						}
						count = j + 1;
					}
					b -= count;
				} else if (k >= c) {
					break;
				}
				if (b <= 0) {
					break;
				}
			}
		}

		long sum = 0;
		for (int i : map.keySet()) {
			sum += i * map.get(i);
		}

		System.out.println(sum);
	}
}