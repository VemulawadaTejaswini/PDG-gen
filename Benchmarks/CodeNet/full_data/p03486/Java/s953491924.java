import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		char[] t = new StringBuilder(sc.next()).reverse().toString().toCharArray();
		sc.close();

		Arrays.sort(s);
		Arrays.sort(t);
		for (int i = 0; i < t.length; i++) {
			if (i == s.length || s[i] < t[i]) {
				System.out.println("Yes");
				return;
			}
			if (s[i] > t[i]) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("No");
	}
}
