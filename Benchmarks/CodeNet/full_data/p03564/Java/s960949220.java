
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			String T = sc.next();
			StringBuilder ans = new StringBuilder();

			int startFlg = -1;
			int flgTmp = -1;
			for (int i = 0; i <= S.length() - T.length(); i++) {
				flgTmp = -1;
				for (int j = 0; j < T.length(); j++) {
					if (S.charAt(i + j) == '?') {
						flgTmp = i;
					} else if (S.charAt(i + j) == T.charAt(j)) {
						flgTmp = i;
					} else {
						flgTmp = -1;
						break;
					}
				}
				if (flgTmp != -1) {
					startFlg = flgTmp;
				}
				System.out.println(i);
				System.out.println(startFlg);
			}
			if (startFlg == -1) {
				System.out.println("UNRESTORABLE");
			} else {
				for (int i = 0; i < startFlg; i++) {
					if (S.charAt(i) == '?') {
						ans.append('a');
					} else {
						ans.append(S.charAt(i));
					}
				}
				ans.append(T);
				if (S.length() > startFlg + T.length()) {
					for (int i = startFlg + T.length(); i < S.length(); i++) {
						if (S.charAt(i) == '?') {
							ans.append('a');
						} else {
							ans.append(S.charAt(i));
						}
					}
				}
				System.out.println(ans);
			}
		}
	}
}
