import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		String S = in.readLine();
		Deque<Integer> queue = new ArrayDeque<>();
		queue.addLast(1);
		for (int i = 1; i < S.length(); ++i) {
			if (S.charAt(i - 1) != S.charAt(i)) {
				queue.addLast(1);
			} else {
				queue.addLast(queue.pollLast() + 1);
			}
		}
		List<Integer> list = new ArrayList<>();
		list.addAll(queue);

		int minLen = Integer.MAX_VALUE;
		int maxLen = Integer.MIN_VALUE;
		for (Integer i : list) {
			minLen = Math.min(minLen, i);
			maxLen = Math.max(maxLen, i);
		}
		if (list.size() <= 2) {
			// maxLen
			System.out.println(maxLen);
		} else {
			System.out.println(minLen * 2);
		}
	}
}