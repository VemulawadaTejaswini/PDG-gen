import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				System.out.println(i + " " + (i + 1));
				return;
			}
		}
		for (int i = 0; i < s.length() - 2; i++) {
			if (s.charAt(i) == s.charAt(i + 2)) {
				System.out.println(i + " " + (i + 2));
				return;
			}
		}
		System.out.println(-1 + " " + (-1));
	}
}
