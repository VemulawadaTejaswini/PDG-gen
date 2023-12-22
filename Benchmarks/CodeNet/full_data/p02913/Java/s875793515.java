import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		String S = scan.nextLine();
		// 半分で分ける
		int ans = 0;
		String tmpS;
		boolean exist = false;
		outer : for (int i = 0; i < S.length(); i++) {
			inner : for (int j = i + 1; j < S.length(); j++) {
				tmpS = S.substring(i, j);
				if (j - i > S.length() - j) {
					break outer;
				}

				for (int k = j; k + tmpS.length() <= S.length(); k++) {
					String wkS = S.substring(k, k + tmpS.length());
					if (j - i > wkS.length()) {
						break inner;
					}
					if (tmpS.equals(wkS)) {
						ans = Math.max(ans, tmpS.length());
						exist = true;
						break;
					}
				}
				if (!exist) {
					break;
				}
				exist = false;
			}
		}
		System.out.println(ans);
	}
}
