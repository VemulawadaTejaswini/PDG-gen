import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		String S = scanner.next();
		String t = "";

		for (int i = 0; i < S.length(); i++) {
			char a = S.charAt(i);
			a += N;
			
			if ('Z' < a) {
				a -= 26;
			}
			t += (char) a;
		}
		System.out.println(t);
	}

}
