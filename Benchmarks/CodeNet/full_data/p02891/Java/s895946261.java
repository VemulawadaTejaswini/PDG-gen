import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

// aba 3 > 3
// a 3 > 1
// a 5 > 2
// aaaba 3 > 5

//aaaba aaaba aaaba
// a1aba 2a3ba 4a5ba

// abaaa abaaa abaaa
// aba1a 2ba3a 4ba5a

// aabaa aabaa aabaa
// a1ba2 a3ba4 a5ba6

// a1a2a 3a4a5 a6a7a 8a9a10 a11a12a

// aaa aaa aaa
// a1a 2a3 a4a

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 文字列の入力
			String s = sc.next();
			// 整数の入力
			int k = sc.nextInt();
//			long cnt = 0;

			// sが奇数個つながりの同じ文字列の場合だけ変わる。
			boolean spFlag = false;
			if (s.length() % 2 == 1) {
				Set<Character> cs = new HashSet<>();
				for (int i = 0; i < s.length(); i++) {
					cs.add(s.charAt(i));
				}
				if (cs.size() == 1) {
					spFlag = true;
				}
			}
			if (spFlag) {
				long result = (((long) k + 1l) / 2l) * ((long) s.length() / 2l);
				result = result + ((long) k / 2l * ((long) s.length() + 1l) / 2l);
				System.out.println(result);
			} else {
				// 1回目
				List<Integer> idxList = new ArrayList<>();
				long res = 0;
				for (int i = 0; i < s.length(); i++) {
					char now = s.charAt(i);
					if (i != 0) {
						char bef = s.charAt(i - 1);
						if (now == bef && !idxList.contains(i - 1)) {
							idxList.add(i);
							res++;
						}
					}
				}

				// 2回目以降
				List<Integer> nextIdxList = new ArrayList<>();
				long nextRes = 0;
				for (int i = 0; i < s.length(); i++) {
					char now = s.charAt(i);
					if (i != 0) {
						char bef = s.charAt(i - 1);
						if (now == bef && !nextIdxList.contains(i - 1)) {
							nextIdxList.add(i);
							nextRes++;
						}
					} else {
						char bef = s.charAt(s.length() - 1);
						if (now == bef && !idxList.contains(s.length() - 1)) {
							nextIdxList.add(i);
							nextRes++;
						}
					}
				}

//			cnt = cnt * k;
//			if (spFlag) {
//				cnt = cnt + (k / 2);
//			}
				long result = res + nextRes * (k - 1);
				// 出力(整数)
				System.out.println(result);
			}
		}
	}
}
