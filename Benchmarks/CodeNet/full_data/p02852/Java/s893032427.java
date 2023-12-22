import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			int n = sc.nextInt();
			int m = sc.nextInt();
			// 文字列の入力
			String s = sc.next();

			StringBuilder rev = new StringBuilder();
			for (int i = s.length() - 1; i >= 0; i--) {
				rev.append(s.charAt(i));
			}
			StringBuilder result = new StringBuilder();
			int adjust = 0;
			for (int i = m; i >= 1; i--) {
				String ss = String.valueOf(rev.charAt(adjust + m));
				if (rev.length() > adjust + m && ss.equals("0")) {
					adjust = adjust + m;
					result.append(String.valueOf(m));
					result.append(" ");
					m = i;
					if (rev.length() == adjust + m) {
						result.setLength(result.length() - 1);
						System.out.println(result);
						return;
					}
				}
			}
			System.out.println("-1");
		}
	}
}
