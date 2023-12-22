import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		String ss = s + s;

		char[] tchar = t.toCharArray();

		int sLen = s.length();
		int tLen = t.length();

		int idx;

		// 探索
		int curLoops = 0;
		int curPos = -1; // 0文字目に対応できるよう最初だけ-1
		int chPos;
		for (idx = 0; idx < tLen; idx++) {
			if (curPos == -1) {
				chPos = ss.indexOf(tchar[idx]);
			} else {
				chPos = ss.indexOf(tchar[idx], curPos + 1);
			}
			if (chPos < 0) {
				// 解なし
				System.out.println("-1");
				return;
			}

			curPos = chPos;
			if (curPos >= sLen) {
				curPos -= sLen;
				++curLoops;
			}
		}

		long answer = ((long) curLoops) * ((long) sLen) + ((long) curPos) + 1L;

		System.out.println(answer);

	}

}
