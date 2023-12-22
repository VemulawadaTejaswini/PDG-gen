import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		String S = scan.nextLine();
		int ans = 0;
		String tmpS;
		boolean exist = false;

		for (int i = 0; i < S.length(); i++) {
			for (int j = i; j <= S.length(); j++) {
				tmpS = S.substring(i, j);
				for (int k = j; k + tmpS.length() <= S.length(); k++) {
					String wkS = S.substring(k, k + tmpS.length());
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
