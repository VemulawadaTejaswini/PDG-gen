import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String t = scan.nextLine();
		int len = t.length();
		int max = 1000;

		String tmpS = "";
		char[] tChars = t.toCharArray();
		int lastIndex = -1;
		int tmpIndex = -1;
		int loopCnt = 0;
		int ans = -1;
		int cnt = 0;

		for (char c : tChars) {
			// 続きから後ろを確認
			tmpIndex = s.indexOf(c, lastIndex + 1);
			if (tmpIndex != -1) {
				lastIndex = tmpIndex;
			}
			else {
				// 見つからなければ、次週に
				loopCnt++;
				if (loopCnt >= max) {
					break;
				}
				tmpS = s.substring(0, lastIndex + 1);
				lastIndex = tmpS.indexOf(c);
				// 見つからなければ終了
				if (lastIndex == -1) {
					break;
				}
			}
			cnt++;
			if (cnt == len) {
				ans = (s.length() * loopCnt) + lastIndex + 1;
			}
		}
		System.out.println(ans);
	}
}
