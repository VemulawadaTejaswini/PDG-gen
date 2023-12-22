import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		int N = S.length();
		//S全体が回文であるかチェック
		for (int i = 0; i < (N - 1) / 2; i++) {
			if (S.charAt(i) != S.charAt(N - 1 - i)) {
				System.out.println("No");
				return;
			}
		}

		for (int i = 0; i < (N - 1) / 4; i++) {
			if (S.charAt(i) != S.charAt((N - 3) / 2 - i)
					|| S.charAt((N + 1) / 2 + i) != S.charAt(N - 1 - i)) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}
