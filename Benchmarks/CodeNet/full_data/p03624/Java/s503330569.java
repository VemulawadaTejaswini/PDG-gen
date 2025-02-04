import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		TreeSet<Character> ts = new TreeSet<>();
		for (int i = 0; i < s.length(); i++) {
			ts.add(s.charAt(i));
		}
		if (ts.size() == 26) {
			System.out.println("None");
			return;
		}

		int a = 'a';
		int z = 'z';
		for (int i = a; i <= z; i++) {
			int ans = i;
			if ((int) ts.pollFirst() != ans) {
				System.out.println((char) ans);
				return;
			}
		}
	}
}