import java.util.*;

public class Main {
	static String AKI = "AKIHABARA";
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next() + "a";
		int idx = 0;
		for (int i = 0; i < AKI.length(); i++) {
			if (s.charAt(i - idx) != AKI.charAt(i)) {
				if (AKI.charAt(i) == 'A') {
					idx++;
				} else {
					System.out.println("NO");
					return;
				}
			}
		}
		if (s.charAt(AKI.length() - idx) != 'a') {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
