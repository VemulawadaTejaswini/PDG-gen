import java.util.*;
import java.lang.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder t = new StringBuilder(s);
		t.reverse();
		boolean no = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'b') {
				if (t.charAt(i) != 'd') {
					no = true;
					break;
				}
			} else if (s.charAt(i) == 'd') {
				if (t.charAt(i) != 'b') {
					no = true;
					break;
				}
			} else if (s.charAt(i) == 'p') {
				if (t.charAt(i) != 'q') {
					no = true;
					break;
				}
			} else if (s.charAt(i) == 'q') {
				if (t.charAt(i) != 'p') {
					no = true;
					break;
				}
			}
		}
		if (no) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
	}
}