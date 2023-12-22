import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		try (Scanner sc = new Scanner(System.in)) {

			int n = sc.nextInt();
			sc.nextLine();

			Map<String, Long> map = new HashMap<>();
			for (int i = 0; i < n; i++) {

				String s = sc.nextLine();
				if (!s.matches("^[MARCH].*$")) {
					continue;
				}

				inc(map, s.substring(0, 1));

			}

			long ans = 0;
			List<Long> list = new ArrayList<>(map.values());
			for (int i = 0; i < list.size() - 2; i++) {
				for (int j = i + 1; j < list.size() - 1; j++) {
					for (int k = j + 1; k < list.size(); k++) {

						long c = 1;
						c *= list.get(i).longValue();
						c *= list.get(j).longValue();
						c *= list.get(k).longValue();

						ans += c;

					}
				}
			}

			System.out.println(ans);

		}

	}

	private static final <T> void inc(Map<T, Long> map, T key) {

		Long val = map.get(key);

		if (null == val) {
			val = Long.valueOf(1);

		} else {
			val = Long.valueOf(val.longValue() + 1);
		}

		map.put(key, val);

	}

}
