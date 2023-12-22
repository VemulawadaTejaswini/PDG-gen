import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s[] = new int[26];
		int t[] = new int[26];
		String S = sc.next();
		String T = sc.next();
		for (int i=0;i<S.length();i++) {
			s[S.charAt(i)-'a']++;
		}
		for (int i=0;i<T.length();i++) {
			t[T.charAt(i)-'a']++;
		}
		for (int i=25;i>=0;i--) {
			if (s[i]<t[i]) {
				System.out.println("Yes");
				return ;
			}
		}
		if (s.length<t.length) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}