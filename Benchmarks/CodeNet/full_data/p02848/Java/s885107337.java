import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		StringBuffer result = new StringBuffer("");
		String moji = "";
		int N = sc.nextInt();
		String S = sc.next();

		String[] str = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
				"T", "U", "V", "W", "X", "Y", "Z" };
		if (!(N == 0)) {
			for (int a = 0; a < S.length(); a++) {
				int ind = 0;
				moji = S.substring(a, a + 1);

				for (int i = 0; i < str.length; i++) {
					if (str[i].equals(moji)) {
						ind = i;
					}
				}

				for (int i = 0; i < N; i++) {

					if (ind + 1 == 26) {
						ind = 0;
					} else {
						ind = ind + 1;
					}
				}

				moji = str[ind];

				result.append(moji);
			}
			System.out.println(result.toString());
		} else {
			System.out.println(S);
		}

	}
}
