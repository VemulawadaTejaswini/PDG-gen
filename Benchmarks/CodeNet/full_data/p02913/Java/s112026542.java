
import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);

		int N = Integer.parseInt(in.readLine());
		String S = in.readLine();

		Map<Character, List<Integer>> map = new HashMap<>();
		for (int i = 0; i < S.length(); ++i) {
			Character c = S.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c, new ArrayList<Integer>());
			}
			map.get(c).add(i);
		}
		int maxLen = 0;
		for (Character c : map.keySet()) {
			List<Integer> list = map.get(c);
			if (list.size() <= 1) {
				continue;
			}
			for (int i = 0; i < list.size(); ++i) {
				for (int j = i + 1; j < list.size(); ++j) {
					int startI = list.get(i);
					int startJ = list.get(j);
					if (maxLen >= startJ - startI || maxLen >= S.length() - startJ) {
						break;
					}
					maxLen = Math.max(maxLen, maxCommon(S, startI, startJ));
				}
			}
		}
		System.out.println(maxLen);

	}

	static int maxCommon(String S, int i, int j) {
		int len = 1;
		while (true) {
			int indexA = i + len;
			int indexB = j + len;
			if (indexB >= S.length()) {
				break;
			}
			if (indexA >= j) {
				break;
			}
			if (S.charAt(indexA) != S.charAt(indexB)) {
				break;
			}
			++len;
		}
		return len;
	}
}