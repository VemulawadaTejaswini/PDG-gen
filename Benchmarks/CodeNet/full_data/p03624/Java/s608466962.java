import java.util.Scanner;

public class MainB071 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();   ///標準入力
		int [] a = new int[26];
		for (char c: S.toCharArray()) {
			a[c-97] += 1;
		}
		String ans = "None";
		for (int i = 0; i < 26; i++) {
			if (a[i] == 0) {
				ans = Character.toString((char) (i+97));
				break;
			}
		}
	ans = "None";
		System.out.println( ans );
	}
}