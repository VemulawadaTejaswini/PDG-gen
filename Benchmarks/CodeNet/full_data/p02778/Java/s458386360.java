import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		int num = S.length();
		int i = 0;
		StringBuilder ans = new StringBuilder();
		while (i < num) {
			ans.append("x");
			i++;
		}

		System.out.println(ans);

	}

}