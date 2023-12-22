import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Map<Integer, Long> map = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			String str[] = br.readLine().split(" ");

			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);

			if (map.containsKey(b))
				map.put(b, map.get(b) + a);
			else
				map.put(b, (long) a);
		}

		Object key[] = map.keySet().toArray();

		int count = 0;
		long left = 0;
		for (long i : map.values()) {
			if ((int) key[count] < i) {
				System.out.println("No");
				return;
			}

			long dist = (int) key[count] - left;

			if (map.get((int) key[count]) > dist) {
				System.out.println("No");
				return;
			}
			left += map.get((int) key[count]);
			count++;
		}

		System.out.println("Yes");
	}
}
