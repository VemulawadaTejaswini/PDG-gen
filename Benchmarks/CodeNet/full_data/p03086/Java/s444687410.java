import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		String[] a = { "A", "C", "G", "T" };

		int cnt = 0;
		int maxCnt = 0;
		boolean flg = false;
		for (int i = 0; i < S.length(); i++) {
			flg = false;
			for (int j = 0; j < a.length; j++) {
				if (String.valueOf(S.charAt(i)).equals(a[j])) {
					cnt++;
					flg = true;
					break;
				}
			}
			if (maxCnt < cnt) {
				maxCnt = cnt;
			}
		}
		System.out.println(maxCnt);

	}

}
