import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	String a, b, c;
	long result = 6001;

	static class Match {
		String a, b;

		Match(String a, String b) {
			this.a = a;
			this.b = b;
		}

		int aFirstMatch(boolean[][] array) {
			int result = a.length();
			for (int i = 0; i < a.length(); ++i) {
				int w = i;
				int h = 0;
				boolean isOK = true;
				while (w < a.length() && h < b.length()) {
					if (!array[h][w]) {
						isOK = false;
						break;
					}
					++w;
					++h;
				}
				if (isOK) {
					result = i;
					break;
				}
			}
			return result;
		}

		int bFirstMatch(boolean[][] array) {
			int result = b.length();
			for (int i = 0; i < b.length(); ++i) {
				int w = 0;
				int h = i;
				boolean isOK = true;
				while (w < a.length() && h < b.length()) {
					if (!array[h][w]) {
						isOK = false;
						break;
					}
					++w;
					++h;
				}
				if (isOK) {
					result = i;
					break;
				}
			}
			return result;
		}

		String getMatchStr(int startIndex, boolean isAFirst) {
			StringBuilder strBuilder = new StringBuilder();
			if (isAFirst) {
				// Aの方が先に来る
				strBuilder.append(this.a.substring(0, startIndex));
				for (int i = startIndex; i < a.length(); ++i) {
					char A = a.charAt(i);
					char B = b.charAt(i - startIndex);
					if (A == '?' && B == '?') {
						strBuilder.append('?');
					} else if (A == '?') {
						strBuilder.append(B);
					} else {
						strBuilder.append(A);
					}
				}
				for (int i = a.length() - startIndex; i < b.length(); ++i) {
					strBuilder.append(b.charAt(i));
				}
			} else {
				// Bの方が先に来る
				strBuilder.append(this.b.substring(0, startIndex));
				for (int i = startIndex; i < b.length(); ++i) {
					char A = b.charAt(i);
					char B = a.charAt(i - startIndex);
					if (A == '?' && B == '?') {
						strBuilder.append('?');
					} else if (A == '?') {
						strBuilder.append(B);
					} else {
						strBuilder.append(A);
					}
				}
				for (int i = b.length() - startIndex; i < a.length(); ++i) {
					strBuilder.append(a.charAt(i));
				}
			}
			return strBuilder.toString();
		}

		String match() {
			boolean[][] array = new boolean[b.length()][a.length()];
			for (int i = 0; i < array.length; ++i) {
				Arrays.fill(array[i], true);
			}

			for (int i = 0; i < b.length(); ++i) {
				boolean isAnon = false;
				if (b.charAt(i) == '?') {
					isAnon = true;
				}
				for (int j = 0; j < a.length(); ++j) {
					if (isAnon) {
						array[i][j] = true;
					} else if (a.charAt(j) == '?') {
						array[i][j] = true;
					} else if (b.charAt(i) == a.charAt(j)) {
						array[i][j] = true;
					} else {
						array[i][j] = false;
					}
				}
			}

			// matchIndexを求める
			int aFirstMatchIndex = this.aFirstMatch(array);
			int bFirstMatchIndex = this.bFirstMatch(array);
			String aFirstMatchStr = getMatchStr(aFirstMatchIndex, true);
			String bFirstMatchStr = getMatchStr(bFirstMatchIndex, false);
			if (aFirstMatchStr.length() < bFirstMatchStr.length()) {
				return aFirstMatchStr;
			} else {
				return bFirstMatchStr;
			}
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		a = in.readLine();
		b = in.readLine();
		c = in.readLine();
	}

	void calc() {
		// まずaとbのマッチstrを求める
		Match matchAB = new Match(a, b);
		String strAB = matchAB.match();
		Match matchABC = new Match(strAB, c);
		String strABC = matchABC.match();

		Match matchAC = new Match(a, c);
		String strAC = matchAC.match();
		Match matchACB = new Match(strAC, b);
		String strACB = matchACB.match();

		Match matchBC = new Match(b, c);
		String strBC = matchBC.match();
		Match matchBCA = new Match(strBC, a);
		String strBCA = matchBCA.match();
//		System.out.println(strABC);
//		System.out.println(strACB);
//		System.out.println(strBCA);

		result = Math.min(result, strABC.length());
		result = Math.min(result, strACB.length());
		result = Math.min(result, strBCA.length());
	}

	void showResult() {
		System.out.println(result);
	}
}