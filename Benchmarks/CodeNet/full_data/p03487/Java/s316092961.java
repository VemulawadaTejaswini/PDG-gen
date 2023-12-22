import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		Map<Long, Integer> counts = new HashMap<>();
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			Long val = Long.parseLong(tokens[i]);
			if (!counts.containsKey(val)) {
				counts.put(val, 1);
			} else {
				counts.put(val, counts.get(val) + 1);
			}
		}
		List<Long> keys = new ArrayList<>(counts.size());
		keys.addAll(counts.keySet());
		Collections.sort(keys);
		int rmNum = 0;
		for (Long key : keys) {
			int num = counts.get(key);
			if (num != key) {
				if (num > key) {
					rmNum += num - key;
				} else {
					rmNum += Math.min(num, key - num);
				}
			}
		}
		System.out.println(rmNum);
	}
}
