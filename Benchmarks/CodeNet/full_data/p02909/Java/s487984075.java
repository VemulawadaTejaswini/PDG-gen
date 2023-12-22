import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static String[] TENKI = { "Sunny", "Cloudy", "Rainy" };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int ansewr;

		ansewr = (Arrays.asList(TENKI).indexOf(S) + 1 )% 3;

		System.out.println(TENKI[ansewr]);
	}
}
