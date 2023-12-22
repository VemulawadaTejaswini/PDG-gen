import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		HashSet<String> hs = new HashSet<>();
		char last = ' ';
		String str;
		boolean b = true;
		for (int i = 0; i < n; i++) {
			str = sc.next();
			if (hs.add(str)) {
				if (i != 0) {
					if (last != str.charAt(0)) {
						b = false;
						break;
					} else {
						last = str.charAt(str.length() - 1);
					}
				} else {
					last = str.charAt(str.length() - 1);
				}
			} else {
				b = false;
				break;
			}
		}
		if (b) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
