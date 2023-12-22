import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		int[][] next = new int[s.length() + 1]['z' - 'a'];
		for (int i = 0; i < next.length; i++) {
			Arrays.fill(next[i], -1);
		}

		String ss = s.concat(s);
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < ss.length(); j++) {
				if (next[i][ss.charAt(j) - 'a'] != -1) continue;
				next[i][ss.charAt(j) - 'a'] = j;
			}
		}

		long a = 0;
		int current = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == t.charAt(0)) {
				current = i;
				a += i;
				break;
			}
		}
		for (int i = 1; i < t.length(); i++) {
			int nx = next[current][t.charAt(i) - 'a'];
			if (nx == -1) {
				System.out.println(-1);
				return;
			}

			a += nx - current;
			current = nx % s.length();
		}

		System.out.println(a + 1);
	}
}
