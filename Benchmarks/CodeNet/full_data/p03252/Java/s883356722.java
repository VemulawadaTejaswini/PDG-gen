import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] s = sc.next().toCharArray();
		char[] t = sc.next().toCharArray();
		char[] az = new char[26];
		boolean b = true;
		for (int i = 0; i < 26; i++) {
			az[i] = 'A';
		}
		for (int i = 0; i < s.length; i++) {
			if (az[t[i] - 'a'] == 'A') {
				az[t[i] - 'a'] = s[i];
			} else {
				if (az[t[i] - 'a'] != s[i]) {
					b = false;
					break;
				}
			}
		}
		if(b) {
			sb.append("Yes");
		}else {
			sb.append("No");
		}
		System.out.println(sb);
	}
}
