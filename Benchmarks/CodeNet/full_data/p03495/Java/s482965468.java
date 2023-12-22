import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		Map<Integer, Integer> amap = new TreeMap<>();

		for (int i = 0; i < N; i++) {
			Integer a = sc.nextInt();

			if (!amap.containsKey(a)) {
				amap.put(a, 1);
			} else {
				amap.put(a, amap.get(a) + 1);
			}
		}

		List<Integer> vallist = new ArrayList<>(amap.values());
		//List<Entry<Integer, Integer>> listEntries = new ArrayList<Entry<Integer, Integer>>(amap.entrySet());

		Collections.sort(vallist);

		int cnt = 0;
		if (amap.size() > K) {
			for (int i = 0; i < amap.size() - K; i++) {
				cnt += vallist.get(i);
			}
		}
		System.out.println(cnt);
	}
}

