
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		Map<Integer, Integer> n = new TreeMap<>();
		for (int i = 0; i < N; i++) {
			Integer integer = sc.nextInt();
			if (n.containsKey(integer)) {
				int count = n.get(integer) + 1;
				n.put(integer, count);
			} else {
				n.put(integer, 1);
			}
		}
		int ans = 0;
		if (K < n.size()) {
			List<Map.Entry<Integer, Integer>> mapValuesList = new ArrayList<Map.Entry<Integer, Integer>>(n.entrySet());
			Collections.sort(mapValuesList, new Comparator<Map.Entry<Integer, Integer>>() {
				@Override
				public int compare(Entry<Integer, Integer> entry1, Entry<Integer, Integer> entry2) {
					return ((Integer) entry1.getValue()).compareTo((Integer) entry2.getValue());
				}
			});
			int diff = n.size() - K;
			for (int i = 0; i < diff; i++) {
				ans += (int) mapValuesList.get(i).getValue();
			}
		}
		System.out.println(ans);
		sc.close();
	}
}