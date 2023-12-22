import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String firstChar = String.valueOf(s.charAt(0));
		String lengthChar = String.valueOf(s.length() - 2);
		String lastChar = String.valueOf(s.charAt(s.length() - 1));

		// 出力
		System.out.println(firstChar + lengthChar + lastChar);

		sc.close();
	}
}
