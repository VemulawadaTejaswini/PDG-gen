import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		Long m = sc.nextLong();
		TreeMap<Long, List<Long>> map = new TreeMap<>();
		while (sc.hasNextLong()) {
			Long a = sc.nextLong(); // a日後
			Long b = sc.nextLong(); // 報酬
			List<Long> list = map.getOrDefault(a, new ArrayList<>());
			list.add(b);
			map.put(a, list);
		}

		// 日数ごとにバイトの報酬順でのソート
		for (Long key : map.keySet()) {
			List<Long> list = map.get(key);
			Collections.sort(list);
		}

		long sum = 0;
		for (long i = m; i > 0L; i--) {
			Long maxKye = 1L;
			Long maxValue = 0L;
			for (Long key : map.keySet()) {
				if (m - key >= 0) {
					List<Long> temp = map.get(key);
					maxValue = Math.max(maxValue, temp.get(temp.size() - 1));
					maxKye = key;
				}
			}
			sum = maxValue + sum;
			List<Long> temp = map.get(maxKye);
			temp.remove(temp.size() - 1);
		}
		System.out.println(sum);
	}
}
