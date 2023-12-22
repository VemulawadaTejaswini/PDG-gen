import java.util.Scanner;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] S = sc.next().toCharArray();
		sc.close();
		char before = S[0];
		int ans = 0;
		for(int i = 1; i < S.length; i++) {
			boolean ok = false;
			char s = S[i];
			if((before == '0' && s == '1')
				|| (before == '1' && s == '0')) {
				ok = true;
			} else {
				s = before == '0' ? '1' : '0';
			}
			before = s;
			if(!ok) ans++;
		}
		System.out.println(ans);
	}
}