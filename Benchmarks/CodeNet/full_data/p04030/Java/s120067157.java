import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.close();

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'B') {
				if (sb.length() > 0) {
					sb.deleteCharAt(sb.length() - 1);
				}
			} else {
				sb.append(s[i]);
			}
		}
		System.out.println(sb.toString());
	}
}
