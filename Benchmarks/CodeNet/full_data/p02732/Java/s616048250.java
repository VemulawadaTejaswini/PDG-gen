import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		int maxCount = 0;
		for (int i = 0; i < n; i++) {
			int in = sc.nextInt();
			list.add(in);
			int count = map.getOrDefault(in, 0) + 1;
			if (maxCount < count) {
				maxCount = count;
			}
			map.put(in, count);
		}
		sc.close();
		List<Long> memo = new ArrayList<>();
		memo.add(0L);
		maxCount++;
		for (int i = 1; i < maxCount; i++) {
			long before = memo.get(i - 1);
			memo.add(before + i - 1);
		}
		for (Integer i : list) {
			long sum = 0;
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				int key = entry.getValue();
				if (entry.getKey() == i) {
					key = key - 1;
				}
				sum = sum + memo.get(key);
			}
			System.out.println(sum);
		}
	}
}
