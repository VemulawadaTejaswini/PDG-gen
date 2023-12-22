import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			Map<Integer, Map<Integer, Long>> map = new TreeMap<Integer, Map<Integer, Long>>();
			for (int i = 0; i < m; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				long c = sc.nextLong();

				if (map.get(b) == null) {
					Map<Integer, Long> tmp = new TreeMap<Integer, Long>();
					tmp.put(a, c);
					map.put(b, tmp);
				} else {
					map.get(b).put(a, c);
				}
			}

			long maxScore = calcScore(map, n, 0l);

			if (map.get(1) == null || maxScore < 0) {
				System.out.println(maxScore);
			} else {
				System.out.println("inf");
			}
		}
	}

	private static long calcScore(Map<Integer, Map<Integer, Long>> map, int node, Long score) {
		if (node == 1) {
			return score;
		}

		Long max = null;
		for (int i : map.get(node).keySet()) {
			long tmp = calcScore(map, i, map.get(node).get(i) + score);
			if (max == null) {
				max = tmp;
			} else if(max < tmp) {
				max = tmp;
			}
		}
		return max;
	}
}
