import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean bre = false;
		for (int i = 0; s.length() > 0; i++) {
			if (s.substring(s.length() - 5).equals("dream") || s.substring(s.length() - 5).equals("erase")) {
				s = s.substring(0, s.length() - 5);
			} else if (s.substring(s.length() - 6).equals("eraser")) {
				s = s.substring(0, s.length() - 6);
			} else if (s.substring(s.length() - 7).equals("dreamer")) {
				s = s.substring(0, s.length() - 7);
			} else {
				bre = true;
				break;
			}
		}
		if (bre) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}