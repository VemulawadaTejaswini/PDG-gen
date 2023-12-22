import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	class Query implements Comparable<Query> {
		int type;// 0:turn,1:answer
		long t = -1;
		long a = -1;

		public Query(int type_, long v_, long a_) {
			type = type_;
			if (type == 0) {
				t = v_;
			} else {
				t = v_;
				a = a_;
			}
		}

		@Override
		public int compareTo(Query o) {
			if (t != o.t) {
				return Long.compare(t, o.t);
			} else {
				return -Long.compare(type, o.type);
			}
		}
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		long X = sc.nextLong();
		int K = sc.nextInt();
		PriorityQueue<Query> pq = new PriorityQueue<>();
		for (int i = 0; i < K; ++i) {
			pq.add(new Query(0, sc.nextLong(), -1));
		}
		int Q = sc.nextInt();
		for (int i = 0; i < Q; ++i) {
			long t = sc.nextLong();
			long a = sc.nextLong();
			pq.add(new Query(1, t, a));
		}

		int coe = -1;
		long upper = X;
		long lower = 0;
		long preR = 0;
		long upperpos = X;
		long lowerpos = 0;
		while (!pq.isEmpty()) {
			Query q = pq.poll();
			if (q.type == 1) {
				if (lower > q.a) {
					q.a = lower;
				} else if (upper < q.a) {
					q.a = upper;
				}
				long ans = -1;
				if (coe == 1) {
					ans = Math.min(X, (q.a - lower) + lowerpos + coe * (q.t - preR));
				} else {
					ans = Math.max(0, (q.a - lower) + lowerpos + coe * (q.t - preR));
				}
				pw.println(ans);
			} else {
				long d = q.t - preR;
				if (coe == -1) {
					if (lowerpos < d) {
						lower = lower + d - lowerpos;
					}
				} else {
					if (upperpos > X - d) {
						upper = upper - (upperpos - (X - d));
					}
				}
				lower = Math.min(lower, X);
				upper = Math.min(upper, X);
				lower = Math.max(lower, 0);
				upper = Math.max(upper, 0);

				lowerpos += d * coe;
				upperpos += d * coe;
				lowerpos = Math.max(lowerpos, 0);
				upperpos = Math.max(upperpos, 0);
				lowerpos = Math.min(lowerpos, X);
				upperpos = Math.min(upperpos, X);
				preR = q.t;
				coe *= -1;
			}
		}
		pw.close();
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
