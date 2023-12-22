import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		TreeMap<String, Integer> map = new TreeMap<>();
		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}

		int max = map.get(map.lastKey());

		map.entrySet().stream().sorted(java.util.Collections.reverseOrder(java.util.Map.Entry.comparingByValue()))
				.filter(s -> s.getValue() == max).forEach(s -> System.out.println(s.getKey()));
	}
}
