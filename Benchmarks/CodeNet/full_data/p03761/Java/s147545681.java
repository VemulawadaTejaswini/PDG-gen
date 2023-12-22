import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] ansbuget;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt(); scan.nextLine();
		ansbuget = new int[26];
		final int INF = Integer.MAX_VALUE/10;
		Arrays.fill(ansbuget, INF);
		String[] s = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = scan.nextLine();
			alpha(s[i]);
		}
		
		String t = "";
		for (int i = 0; i < 26; i++) {
			if (ansbuget[i] != 0) {
				for (int j = 0; j < ansbuget[i]; j++) {
					t = t + (char)('a'+ i);
				}
			}
		}
		System.out.println(t);
	}

	public static void alpha(String s) {

		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}

		Arrays.sort(c);//ソート
		char A = 'a';//aの文字コード受け取り
		int a = A;
		int[] buget = new int[26];
		for (int i = 0; i < s.length(); i++) {//文字を数値に変換してバゲット法
			buget[c[i] - a]++;//多分ここで各文字からaのコードが引かれて0~25の数になる
		}

		for (int i = 0; i < 26; i++) {
			if (buget[i] < ansbuget[i]) {
				ansbuget[i] = buget[i];
			}
		}
		return;
	}
}

