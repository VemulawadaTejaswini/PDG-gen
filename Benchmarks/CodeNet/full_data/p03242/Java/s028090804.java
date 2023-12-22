import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = String.valueOf(n);
		String ans = "";

		for (int i = 1; i <= 3; i++) {
			String cash = s.substring(i - 1, i);
			if (cash.equals("1")) {

				ans += "9";

			} else {

				ans += "1";

			}
		}
		System.out.println(ans);
	}
}
