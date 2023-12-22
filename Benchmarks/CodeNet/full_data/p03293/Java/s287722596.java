import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		String result = "No";

		for (int i = 0; i < S.length(); i++) {
			S = S.substring(S.length() - 1) + S.substring(0, S.length() - 1);
			if (T.equals(S)) {
				result = "Yes";
				break;
			}
		}
		System.out.println(result);
	}
}
