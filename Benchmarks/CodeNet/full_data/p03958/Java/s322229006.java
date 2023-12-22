

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int t = scanner.nextInt();
		TreeMap<Float, Integer> map = new TreeMap<>(new Comparator<Float>() {
			@Override
			public int compare(Float m, Float n) {
				return m.compareTo(n) * -1;
			}
		});
		for (int i = 0; i < t; i++) {
			map.put(scanner.nextInt() + (float) i / 6, i);
		}

		if (t == 1) {
			System.out.println(map.firstKey() - 1);
			return;
		}

		int last = -1;
		int ans = 0;
		for (int i = 0; i < k; i++) {
			Iterator<Float> key = map.keySet().iterator();
			float tmp = key.next();
			float tmp2 = 0;

			if (map.get(tmp) == last) {

				tmp2 = tmp;
				tmp = key.next();
			}
			if (Math.floor(tmp) == 0) {
				ans = (int) Math.floor(tmp2);
				break;
			} else {

				last = map.get(tmp);
				map.remove(tmp);
				map.put(tmp - 1, last);
			}
		}
		System.out.println(ans);
	}
}
