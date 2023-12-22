import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int a = sc.nextInt();
		final int b = sc.nextInt();
		final String s = sc.next();

		final String matchpattern = "[0-9]{" + a + "}-[0-9]{" + b + "}";

		System.out.println(s.matches(matchpattern) ? "Yes" : "No");

	}

}
