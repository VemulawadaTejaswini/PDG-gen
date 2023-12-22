import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			int N = in.nextInt();
			ArrayList<Integer> lmds = new ArrayList<Integer>();

			for (int i = 0; i < N; ++i) {
				int a = in.nextInt();

				int idx = upperBound(lmds, a, Collections.reverseOrder());
				idx = Math.max(idx, -(idx + 1));

				if (idx >= lmds.size()) {
					lmds.add(a);
				} else {
					if (lmds.get(idx) == a && lmds.get(lmds.size() - 1) == a) {
						lmds.add(idx, a);
					} else {
						lmds.set(idx, a);
					}
				}

			}

			System.out.println(lmds.size());
		}
	}

	private static <T> int upperBound(List<? extends T> list, T key, Comparator<? super T> c) {
		int fromIdx = 0;
		int toIdx = list.size();

		while (fromIdx < toIdx) {
			int mid = fromIdx + (toIdx - fromIdx) / 2;

			if (c.compare(key, list.get(mid)) < 0) {
				toIdx = mid;
			} else {
				fromIdx = mid + 1;
			}
		}

		if (0 <= fromIdx && fromIdx < list.size()) {
			return fromIdx;
		} else {
			return -fromIdx - 1;
		}
	}
}
