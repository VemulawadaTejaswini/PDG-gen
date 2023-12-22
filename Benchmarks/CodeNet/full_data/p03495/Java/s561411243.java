import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		Map<Integer, Integer> map = new TreeMap<>();

		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(str[i]);

			if (map.containsKey(a))
				map.put(a, map.get(a) + 1);
			else
				map.put(a, 1);
		}

		int count = 0;
		int sum = 0;

		for (int i : map.keySet()) {
			if (count == k) {
				break;
			}
			sum += map.get(i);
			count++;
		}

		System.out.println(n - sum);
	}
}
