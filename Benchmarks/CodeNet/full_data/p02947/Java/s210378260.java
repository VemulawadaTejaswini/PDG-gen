import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		String[] s = new String[N];
		int idx;
		for (idx = 0; idx < N; idx++) {
			s[idx] = sc.next();
		}

		int i;
		int j;
		long match = 0;

		for (i = 0; i < N; i++) {
			for (j = i + 1; j < N; j++) {
				// iとj比較
				if (matchstr(s[i], s[j])) {
					++match;
				}
			}
		}

		System.out.println(match);

	}

	private static boolean matchstr(String str1, String str2) {
		char[] c1 = str1.toCharArray();
		int idx;
		Integer pos;
		HashMap<Character, Integer> posMap = new HashMap<Character, Integer>();
		for (idx = 0; idx < 10; idx++) {
			// 探索済み文字か
			pos = posMap.get(c1[idx]);
			if (pos == null) {
				pos = 0;
			} else {
				pos += 1;
			}

			pos = str2.indexOf(c1[idx], pos);
			if (pos < 0) {
				return false;
			} else {
				posMap.put(c1[idx], pos);
			}
		}

		return true;
	}

}
