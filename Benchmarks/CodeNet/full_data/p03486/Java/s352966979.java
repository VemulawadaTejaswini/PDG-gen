import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray(), t = sc.next().toCharArray();
		Arrays.sort(s);
		Arrays.sort(t);
		int c = 0;
		while(true) {
			if(c == t.length) break;
			if(s[c] < t[t.length-(1+c)] || (c == s.length || c < t.length)) {
				System.out.println("Yes");
				return;
			}
			c++;
		}
		System.out.println("No");
	}
}
