import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.nextLine().toCharArray();
		long k = Long.parseLong(in.nextLine());
		System.out.println(solve(s, k));
		in.close();
	}

	private static char solve(char[] s, long k) {
		int index = getIndex(s);
		if (index < 0) {
			// すべて1で構成されている
			return '1';
		} else if (index > k - 1) {
			// １の範囲
			return '1';
		} else {
			return s[index];
		}
	}

	private static int getIndex(char[] s) {
		int result = -1;
		for (int i = 0; i < s.length; ++i) {
			if (s[i] != '1') {
				result = i;
				break;
			}
		}
		return result;
	}
}