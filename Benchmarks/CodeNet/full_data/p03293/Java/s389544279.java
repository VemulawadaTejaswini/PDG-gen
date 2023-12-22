import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		sc.close();

		for (int i = 0; i < S.length(); i++) {
			String S1 = S.substring(0, S.length() - 1);
			String S2 = S.substring(S.length() - 1);
			S = S2 + S1;
			if (S.equals(T)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
