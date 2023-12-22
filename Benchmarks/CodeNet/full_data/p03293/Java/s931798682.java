import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String T = scan.next();
		scan.close();
		String []s = new String[S.length()];
		String []t = new String[S.length()];

		for(int i = 0; i < S.length(); i++) {
			s[i] = S.substring(i, i + 1);
			t[i] = T.substring(i, i + 1);
		}
		Arrays.sort(s);
		Arrays.sort(t);
		for(int i = 0; i < S.length(); i++) {
			if(!s[i].equals(t[i])) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}
}