import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		String S = sc.next();
		char[] c = S.toCharArray();

		for (int i = 0; i < S.length(); i++) {
			if (i % 2 == 0) {
				if (c[i] == 'L') {
					System.out.println("No");
					return;
				}
			} else {
				if (c[i] == 'R') {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}
}