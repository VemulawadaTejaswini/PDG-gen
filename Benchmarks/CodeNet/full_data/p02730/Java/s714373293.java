import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		sc.close();
		int N = S.length();

		int j = N;
		for (int i = 0; i < (N + 1) / 2; i++) {
			if (!S.substring(i, i + 1).equals(S.substring(j - 1, j))) {
				System.out.println("No");
				return;
			}
			j--;
		}

		int l = N;
		int k = (N + 1) / 2;
		for (int i = 0; i < (N + 1) / 4; i++) {

			if (!S.substring(i, i + 1).equals(S.substring((l - 3) / 2, (l - 1) / 2))
					|| !S.substring(i + k, i + k + 1).equals(S.substring(l - 1, l))) {
				System.out.println("No");
				return;
			}
			l--;
		}
		System.out.println("Yes");
	}
}