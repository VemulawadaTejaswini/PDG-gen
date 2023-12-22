import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int total = scan.nextInt();
		String hat = scan.next();
		int result = 0;

		Pattern p = Pattern.compile("R");
		Matcher m = p.matcher(hat);

		while (m.find()) {
			result++;
		}

		System.out.println(total / 2 < result ? "Yes" : "No");
	}
}