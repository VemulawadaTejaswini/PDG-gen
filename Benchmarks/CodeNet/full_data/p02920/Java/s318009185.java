import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		Long[] S = new Long[tokens.length];
		for (int i = 0; i < tokens.length; ++i) {
			S[i] = Long.parseLong(tokens[i]);
		}
		Arrays.sort(S, new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				return -1 * Long.compare(o1, o2);
			}
		});
		// baseとなるqueを作成
		Deque<Long> que = new ArrayDeque<>(S.length);
		for (int i = 0; i < S.length; ++i) {
			que.addLast(S[i]);
		}
		Long[] array = new Long[1];
		array[0] = que.pollFirst();
		for (int i = 0; i < N; ++i) {
			array = step(array, que);
			if (array == null) {
				break;
			}
		}
		if (array != null) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	static Long[] step(Long[] base, Deque<Long> que) {
		Long[] nexts = new Long[base.length * 2];
		// base要素のコピー
		for (int i = 0; i < base.length; ++i) {
			nexts[i * 2] = base[i];
		}
		// 追加
		for (int i = 1; i < nexts.length; i += 2) {
			nexts[i] = que.pollFirst();
			// 条件を満たしているかチェック
			if (nexts[i] >= nexts[i - 1]) {
				return null;
			}
		}
		return nexts;
	}
}