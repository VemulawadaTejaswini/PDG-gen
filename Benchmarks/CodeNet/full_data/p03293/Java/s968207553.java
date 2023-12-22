import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		final String s = sc.next();
		final String t = sc.next();

		final int sLength = s.length();

		String result = "No";
		String s2 = s;
		for (int i = 0; i < sLength; i++) {
			final String last = s2.substring(sLength - 1, sLength);
			String tmps = s2.substring(0, sLength - 1);
			s2 = last + tmps;
			if (s2.equals(t)) {
				result = "Yes";
				break;
			}
		}

		java.lang.System.out.println(result);

	}

}
