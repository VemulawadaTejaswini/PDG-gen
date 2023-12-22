import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Elem implements Comparable<Elem> {
		long val;
		int prevIndex;

		Elem(long val) {
			this.val = val;
			this.prevIndex = -1;
		}

		@Override
		public int compareTo(Elem o) {
			if (val < o.val) {
				return 1;
			} else if (val > o.val) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		int N = Integer.parseInt(in.readLine());
		long[] A = new long[N];
		for (int i = 0; i < N; ++i) {
			A[i] = Long.parseLong(in.readLine());
		}
		Queue<Elem> queue = new PriorityQueue<Elem>();
		for (int i = 0; i < N; ++i) {
			if (queue.isEmpty()) {
				queue.add(new Elem(A[i]));
			} else {
				List<Elem> list = new ArrayList<>();
				Elem target = null;
				while (!queue.isEmpty()) {
					Elem elem = queue.poll();
					if (elem.val < A[i]) {
						if (target != null) {
							list.add(target);
							elem = target;
						} else {
							elem = target;
						}
					} else {
						list.add(elem);
					}
				}
				queue.add(new Elem(A[i]));
				queue.addAll(list);
			}
		}
		System.out.println(queue.size());
	}
}