import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] c = S.toCharArray();
		Set<String> set = new HashSet<>();
		for (int i = 0; i < S.length(); i++) {
			String s = String.valueOf(c[i]);
			set.add(s);
		}
		for (char i = 'a'; i <= 'z'; i++) {
			if (set.contains(String.valueOf(i))) {
			} else {
				System.out.println(i);
				sc.close();
				return;
			}
		}
		sc.close();
		System.out.println("None");
	}
}
