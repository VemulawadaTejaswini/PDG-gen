import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String s = sc.next();
			int len = s.length() - 1;// lenは最後の一文字はチェック不要のため-1する
			char ch;
			for (int i = 0; i < len; i++) {
				ch = s.charAt(i);
				if (s.lastIndexOf(ch) != i) {
					System.out.println("no");
					return;
				}
			}
			System.out.println("yes");

		} finally {
			sc.close();
		}
	}
}