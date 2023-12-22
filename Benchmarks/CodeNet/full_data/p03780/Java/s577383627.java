import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		// for (; solver.hasNext();) {
		solver.readBody(in.readLine());
		// }
	}
}

class Solver {
	int N;
	int K;
	int cnt;

	public void init() {
		N = 0;
		K = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		K = Integer.parseInt(strArr[1]);
		// N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
	}

	public boolean hasNext() {
		return cnt < N;
	}

	public void readBody(String str) {
		String[] strArr = str.split(" ");
		TreeMap<Long, Long> cards = new TreeMap<Long, Long>();
		for (int i = 0; i < N; i++) {
			long a = Long.parseLong(strArr[i]);
			if (cards.containsKey(a))
				cards.put(a, cards.get(a) + 1L);
			else
				cards.put(a, 1L);
		}
		long sum = 0;
		for (long key : cards.keySet()) {
			sum += cards.get(key) * key;
		}
		if (sum < K) {
			System.out.println(N);
			return;
		}

		long ans = 0;
		long limit = 0;
		sum = 0;
		for (long key : cards.keySet()) {
			sum += cards.get(key) * key;
			if (sum >= K) {
				limit = key;
				break;
			}
		}
		// System.out.println(limit + " " + sum);
		for (long key : cards.keySet()) {
			if (key >= limit) {
				break;
			}
			if (sum - key > K) {
				ans += cards.get(key);
			}
		}

		System.out.println(ans);

		cnt++;
	}
}
