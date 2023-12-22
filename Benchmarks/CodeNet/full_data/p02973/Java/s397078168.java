import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList<Long> deque = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			long a = sc.nextLong();
			if (deque.isEmpty()) {
				deque.offer(a);
			} else if (a < deque.getFirst()) {
				deque.addFirst(a);
			} else {
				int index = upperBound(deque, a);
				if (index >= deque.size()) {
					deque.offerLast(a);
				} else if (deque.get(index).equals(a)) {
					deque.add(index + 1, a);
				} else {
					deque.set(index, a);
				}
			}
		}

		System.out.println(deque.size());
	}

	private static int upperBound(List<Long> a, long x) {
		int l = 0, r = a.size();
		while (r - l > 1) {
			int m = (l + r) / 2;
			if (a.get(m) > x) {
				r = m;
			} else {
				l = m;
			}
		}

		return l;
	}
}
