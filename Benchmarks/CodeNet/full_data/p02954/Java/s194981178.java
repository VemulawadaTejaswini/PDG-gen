import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String S = in.readLine();
		List<String> splited = split(S);
		List<Integer> result = new ArrayList<>(S.length());
		for (int i = 0; i < splited.size(); ++i) {
			result.addAll(convert(splited.get(i)));
		}
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(Integer.toString(result.get(0)));
		for (int i = 1; i < result.size(); ++i) {
			strBuilder.append(" " + Integer.toString(result.get(i)));
		}
		System.out.println(strBuilder.toString());
	}

	static List<Integer> convert(String s) {
		int lCount = 0, rCount = 0;
		// 分割位置を求める
		int splitPos = 0;
		for (int i = 0; i + 1 < s.length(); ++i) {
			if (s.charAt(i) != s.charAt(i + 1)) {
				splitPos = i;
				break;
			}
		}
		int lNum = splitPos + 1;
		int rNum = s.length() - lNum;

		if (lNum % 2 == 0) {
			lCount += lNum / 2;
			rCount += lNum / 2;
		} else {
			lCount += lNum / 2 + 1;
			rCount += lNum - lCount;
		}
		if (rNum % 2 == 0) {
			lCount += rNum / 2;
			rCount += rNum / 2;
		} else {
			lCount += rNum / 2;
			rCount += rNum / 2 + 1;
		}
		List<Integer> result = new ArrayList<>(s.length());
		for (int i = 0; i < splitPos; ++i) {
			result.add(0);
		}
		result.add(lCount);
		result.add(rCount);
		for (int i = splitPos + 2; i < s.length(); ++i) {
			result.add(0);
		}

		return result;
	}

	static List<String> split(String S) {
		Deque<StringBuilder> queue = new ArrayDeque<>();
		queue.addLast(new StringBuilder());
		queue.getLast().append(S.charAt(0));
		char last = S.charAt(0);

		for (int i = 1; i < S.length(); ++i) {
			char c = S.charAt(i);
			if (c == 'R') {
				if (last == c) {
					queue.getLast().append(S.charAt(i));
				} else {
					queue.addLast(new StringBuilder());
					queue.getLast().append(S.charAt(i));
				}
			} else {
				if (last == c) {
					queue.getLast().append(S.charAt(i));
				} else {
					queue.getLast().append(S.charAt(i));
				}
			}
			last = c;
		}
		List<String> r = new ArrayList<>(queue.size());
		while (!queue.isEmpty()) {
			r.add(queue.poll().toString());
		}
		return r;
	}
}