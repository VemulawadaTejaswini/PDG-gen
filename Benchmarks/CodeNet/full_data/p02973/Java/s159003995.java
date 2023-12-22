import java.io.*;
import java.util.*;

class Main {

	public static void main(String[] args) throws Exception {
		final Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> a = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			long v = sc.nextLong();
			if (a.size() > 0 && v <= a.get(a.size() - 1)) {
				a.add(v);
				continue;
			}

			int index = reverseLowerBound(a, v);
			if (index >= a.size()) {
				a.add(v);
			} else {
				a.set(index - 1, v);
			}
		}

		System.out.println(a.size());
	}

	private static int reverseLowerBound(List<Long> a, long x) {
		int l = 0, r = a.size();
		while (r - l > 1) {
			int m = (l + r) / 2;
			if (a.get(m) <= x) {
				r = m;
			} else {
				l = m;
			}
		}
		return r;
	}
}
