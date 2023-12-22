
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		String T = scan.next();
		int[] transArrayS = new int[26];
		for (int i = 0; i < transArrayS.length; i++) {
			transArrayS[i] = -1;
		}
		int[] transArrayT = new int[26];
		for (int i = 0; i < transArrayS.length; i++) {
			transArrayT[i] = -1;
		}
		for (int i = 0; i < S.length(); i++) {
			if (transArrayS[S.charAt(i) - 'a'] == -1) {
				transArrayS[S.charAt(i) - 'a'] = T.charAt(i) - 'a';
			} else if (transArrayS[S.charAt(i) - 'a'] != T.charAt(i) - 'a') {
				System.out.println("No");
				return;
			}
			if (transArrayT[T.charAt(i) - 'a'] == -1) {
				transArrayT[T.charAt(i) - 'a'] = S.charAt(i) - 'a';
			} else if (transArrayT[T.charAt(i) - 'a'] != S.charAt(i) - 'a') {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
