import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int c0 = S.length() - S.replace("0", "").length();
		int c1 = S.length() - S.replace("1", "").length();

		System.out.println(2 * Math.min(c0, c1));

		sc.close();
	}
}