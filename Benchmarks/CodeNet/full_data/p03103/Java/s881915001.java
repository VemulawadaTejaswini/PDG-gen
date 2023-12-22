import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());

		Map<Long, Integer> m = new TreeMap<>();
		for (int i = 0; i < N; i++) {
			long cost = Long.parseLong(sc.next());
			int remain = Integer.parseInt(sc.next());
			m.put(cost, remain);
		}
		
		long ans = solve(N,M,m);
		System.out.println(ans);
	}

	public static long solve(int N, int M, Map<Long, Integer> m) {

		long ans = 0;
		int remain = M;
		for (Entry<Long, Integer> entry : m.entrySet()) {

			int tmp = remain - entry.getValue();
			if (tmp > 0) {

				// 1店舗分全部買い取れる
				ans += (long) entry.getKey() * entry.getValue();
			} else {

				// 全部は買い取れない。
				ans += (long) entry.getKey() * remain;
			}
			remain -= entry.getValue();
			if (remain <= 0) {
				// もう買い取る必要がないので抜ける
				break;
			}
		}
		return ans;
	}
}
