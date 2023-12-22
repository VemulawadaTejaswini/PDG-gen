import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String s;
		n = sc.nextInt();
		s = sc.next();

		int ans = 0;
		for (int i = 1; i < s.length(); i++) {
			int tmp = check(s.substring(0, i), s.substring(i));
			ans = Math.max(ans, tmp);
		}
		System.out.print(ans);
	}

	static int check(String s, String t) {
		int[] a = new int[26];
		int[] b = new int[26];
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			int num = s.charAt(i) - 'a';
			a[num] = 1;
		}
		for (int i = 0; i < t.length(); i++) {
			int num = t.charAt(i) - 'a';
			b[num] = 1;
		}
		for (int i = 0; i < 26; i++) {
			if(a[i] == 1 && b[i] == 1) cnt++;
		}

		return cnt;
	}
}