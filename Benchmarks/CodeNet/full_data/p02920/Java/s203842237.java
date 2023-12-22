import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		int N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		List<Long> S = new ArrayList<>(tokens.length);
		for (int i = 0; i < tokens.length; ++i) {
			S.add(Long.parseLong(tokens[i]));
		}
		Collections.sort(S, new Comparator<Long>() {
			@Override
			public int compare(Long o1, Long o2) {
				return Long.compare(o1, o2);
			}
		});
		// System.out.println(toStr(S.toArray(new Long[0])));

		Long[] array = new Long[1];
		array[0] = S.get(S.size() - 1);
		S.remove(S.size() - 1);
		for (int i = 0; i < N; ++i) {
			array = step(array, S);
			if (array == null) {
				break;
			}
		}
		// System.out.println(toStr(array));
		// arrayの検証
		/*
		 * for (int i = 0; i < N; ++i) { array = revStep(array); if (array == null) {
		 * break; } }
		 */
		if (array != null) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	static Long[] revStep(Long[] base) {
		// 条件チェック
		for (int i = 0; i < base.length; i += 2) {
			if (base[i] <= base[i + 1]) {
				return null;
			}
		}
		Long[] nexts = new Long[base.length / 2];
		for (int i = 0; i < nexts.length; ++i) {
			nexts[i] = base[i * 2];
		}

		return nexts;
	}

	static Long[] step(Long[] base, List<Long> list) {
		Long[] nexts = new Long[base.length * 2];
		// base要素のコピー
		for (int i = 0; i < base.length; ++i) {
			nexts[i * 2] = base[i];
		}
		// 追加
		for (int i = 1; i < nexts.length; i += 2) {
			Long val = search(list, nexts[i - 1]);
			if (val < 0) {
				return null;
			}
			nexts[i] = val;
		}
		// System.out.println(toStr(nexts));
		return nexts;
	}

	/*
	 * 
	 */
	static Long search(List<Long> list, Long val) {
		int index = Collections.binarySearch(list, val - 1L);
		if (index >= 0) {
			// その座標の値を採用 + 削除
			Long result = list.get(index);
			list.remove(index);
			return result;
		} else {
			int i = (index + 1) * -1;
			if (i == 0) {
				// 値がなかった
				return -1L;
			} else {
				// その値を採用
				i = Math.min(i, list.size() - 1);
				Long result = list.get(i);
				if(result >= val) {
					return -1L;
				}
				list.remove(i);
				return result;
			}
		}
	}

	static String toStr(Long[] array) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < array.length; ++i) {
			strBuilder.append(" " + array[i]);
		}
		return strBuilder.toString();
	}
}
