import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		List<Long> S = new ArrayList<>();
		for (int i = 0; i < tokens.length; ++i) {
			S.add(Long.parseLong(tokens[i]));
		}
		
		Collections.sort(S, new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				return -1 * Long.compare(o1, o2);
			}
		});
		Deque<Long> deque = new ArrayDeque<>();
		deque.addAll(S);
		boolean result = enable(deque, 1, N);
		if (result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

	static boolean enable(Deque<Long> deque, int current, int max) {
		if (current == max) {
			// 最後の時間
			if (deque.getFirst() == deque.getLast()) {
				return false;
			} else {
				return true;
			}
		} else {
			// 次の世代を生成可能か調べる
			Long parent = deque.pollFirst();
			if (parent <= deque.getFirst()) {
				return false;
			}
			for (int i = current; i < max; ++i) {
				if (parent <= deque.getLast()) {
					return false;
				} else {
					deque.pollLast();
				}
			}
			return enable(deque, current + 1, max);
		}

	}
}
