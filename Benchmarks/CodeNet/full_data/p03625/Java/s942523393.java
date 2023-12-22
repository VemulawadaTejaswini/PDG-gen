import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());

		for (int i = 0; i < n; i++) {
			int tmp = scanner.nextInt();
			if (map.containsKey(tmp)) {
				map.put(tmp, map.get(tmp) + 1);

			} else {
				map.put(tmp, 1);
			}
		}

		int cnt = 0;
		int max1 = 0;
		int max2 = 0;
		int sq = 0;
		boolean judge = true;
		for (int i : map.keySet()) {
			int tar = map.get(i);
			if (tar >= 2 && cnt == 0) {
				max1 = i;
				cnt++;
			} else if (tar >= 2 && cnt == 1) {
				max2 = i;
				cnt++;
			}
			if (tar >= 4 && judge) {
				sq = i;
				judge = false;
			}
		}

		if (cnt == 2) {
			System.out.println((long) max1 * max2);
		} else if (sq != 0) {
			System.out.println((long) sq * sq);
		} else {
			System.out.println(0);
		}
	}
}