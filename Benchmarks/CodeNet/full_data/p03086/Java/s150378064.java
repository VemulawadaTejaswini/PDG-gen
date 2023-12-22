import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		Set<Character> set = new HashSet<Character>();
		set.add('A');
		set.add('C');
		set.add('G');
		set.add('T');

		int ans = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				String str = s.substring(i, j);
				boolean flg = true;
				for (int k = 0; k < str.length(); k++) {
					if (!set.contains(str.charAt(k))) {
						flg = false;
						break;
					}
				}
				if (flg) {
					ans = Math.max(ans, str.length());
				}
			}
		}
		System.out.println(ans);
	}
}
