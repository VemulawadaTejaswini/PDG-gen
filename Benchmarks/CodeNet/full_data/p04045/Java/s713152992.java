import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < k; i++) {
			set.add(sc.next().charAt(0));
		}
		sc.close();

		for (int i = n; ; i++) {
			String s = String.valueOf(i);
			boolean flg = true;
			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				if (set.contains(ch)) {
					flg = false;
					break;
				}
			}
			if (flg) {
				System.out.println(i);
				return;
			}
		}
	}
}
