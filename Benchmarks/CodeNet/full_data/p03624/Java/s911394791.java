import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		char a = 0;
		char b = 0;
		char[] c = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			c[i] = s.charAt(i);
		}
		Arrays.sort(c);
		for (int i = 1; i < s.length(); i++) {
			a = c[i];
			b = c[i-1];
			if (c[i] != c[i-1]) {
				if (a-b != 1) {
					b++;
					char ans = b;
					System.out.println(ans);
					return;
				}
			}
		}
		System.out.println("None");
	}
}
