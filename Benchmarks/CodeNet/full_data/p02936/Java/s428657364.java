import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		Map<Integer, List<Integer>> conn = new HashMap<>();
		for (int i = 0; i < N - 1; i++) {
			int tmp1 = sc.nextInt();
			int tmp2 = sc.nextInt();
			if (conn.get(tmp1) == null) {
				List<Integer> added = new ArrayList<>();
				added.add(tmp2);
				conn.put(tmp1, added);
			} else {
				conn.get(tmp1).add(tmp2);
			}
		}
		int[] res = new int[N + 1];
		for (int i = 0; i < Q; i++) {
			int where = sc.nextInt();
			int value = sc.nextInt();
			res[where] += value;
		}

		ruiseki(1, 0, res, conn);

		for (int i = 1; i < res.length; i++) {
			System.out.print(res[i] + " ");

		}
	}

	private static void ruiseki(int now, int value, int[] res, Map<Integer, List<Integer>> conn) {
		res[now] += value;
		value = res[now];
		if (conn.get(now) == null) {
			return;
		}
		for (Integer i : conn.get(now)) {
			ruiseki(i, value, res, conn);
		}
	}
}