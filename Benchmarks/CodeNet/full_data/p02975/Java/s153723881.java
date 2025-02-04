import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		long[] a = new long[N];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			a[i] = Long.parseLong(tokens[i]);
		}
		Map<Long, Integer> counts = new HashMap<>();
		for (int i = 0; i < N; ++i) {
			if (!counts.containsKey(a[i])) {
				counts.put(a[i], 1);
			} else {
				counts.put(a[i], counts.get(a[i]) + 1);
			}
		}
		if (counts.size() >= 4) {
			System.out.println("No");
			return;
		}
		if (counts.size() == 1) {
			if (counts.keySet().contains(0L)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			return;
		}



		if (counts.size() == 3) {
			List<Integer> nums = new ArrayList<>();
			nums.addAll(counts.values());
			Collections.sort(nums);
			if (nums.get(0) != nums.get(2)) {
				System.out.println("No");
				return;
			}
			List<Long> values = new ArrayList<>();
			values.addAll(counts.keySet());
			Collections.sort(values);
			long x = values.get(0);
			long y = values.get(1);
			long z = values.get(2);
			if ((x ^ y^z) == 0) {
				System.out.println("Yes");
				return;
			} else {
				System.out.println("No");
				return;
			}
		} else { // counts == 2
			if (!counts.keySet().contains(0L)) {
				System.out.println("No");
				return;
			}
			List<Long> keys = new ArrayList<>();
			keys.addAll(counts.keySet());
			Collections.sort(keys);
			if ((counts.get(keys.get(0)) * 2) == counts.get(keys.get(1))) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
			return;
		}
	}

}