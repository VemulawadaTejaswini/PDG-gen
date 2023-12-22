import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next();
		String ans = "No";

		try {
			Integer.parseInt(s.substring(0, a));

			Integer.parseInt(s.substring(a + 1));
			if (s.length() == a + b + 1) {
				if (s.charAt(a) == '-') {
					ans = "Yes";
				}
			}
		} catch (NumberFormatException e) {
		}
		System.out.println(ans);

	}
}