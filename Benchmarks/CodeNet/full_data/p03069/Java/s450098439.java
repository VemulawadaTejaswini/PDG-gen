import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		int white = 0;
		int black = 0;

		if (s.contains("#")) {
			for (int i = s.indexOf('#') + 1; i < n; i++) {
				if (s.charAt(i) == '.')
					white++;
				else
					black++;
			}
			System.out.println(white < black ? white : black);
		} else {
			System.out.println(0);
		}


	}

}