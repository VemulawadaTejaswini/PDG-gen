import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Solver solver = new Solver();
		solver.init();
		solver.readHead(in.readLine());
		for (; solver.hasNext();) {
			solver.readBody(in.readLine());
		}
		solver.solve();
	}
}

class Solver {
	int N;
	int cnt;
	ArrayList<Integer> A;

	public void init() {
		N = 0;
		cnt = 0;
	}

	public void readHead(String str) {
		String[] strArr = str.split(" ");
		N = Integer.parseInt(strArr[0]);
		// System.out.println(N);
		A = new ArrayList<Integer>();
	}

	public boolean hasNext() {
		return cnt < 1;
		// return cnt < N;
	}

	public void readBody(String str) {
		// System.out.println(str);
		String[] strArr = str.split(" ");
		for (int i = 0; i < 3 * N; i++)
			A.add(Integer.parseInt(strArr[i]));
		cnt++;
	}

	public void solve() {
		long ans = Long.MIN_VALUE;
		PriorityQueue<Integer> firstQ = new PriorityQueue<Integer>();
		PriorityQueue<Integer> secondQ = new PriorityQueue<Integer>(new Comparator<Integer>() {
			public int compare(Integer v1, Integer v2) {
				return v2 - v1;
			}
		});
		for (int k = N; k <= 2 * N; k++) {
			firstQ.clear();
			long first = 0;
			for (int i = 0; i < k; i++) {
				first += A.get(i);
				firstQ.add(A.get(i));
				if (firstQ.size() > N) {
					first -= firstQ.poll();
				}
			}

			secondQ.clear();
			long second = 0;
			for (int i = k; i < 3 * N; i++) {
				second += A.get(i);
				secondQ.add(A.get(i));
				if (secondQ.size() > N) {
					second -= secondQ.poll();
				}
			}

			long score = first - second;
			// System.out.println(score);
			if (ans < score)
				ans = score;
		}

		System.out.println(ans);
	}
}
