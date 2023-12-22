import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String string = sc.nextLine();

		String regex = "hi";
		Pattern pt =Pattern.compile(regex);
		Matcher matcher = null;

		for (int i = 0; i < string.length(); i+=2) {
			matcher = pt.matcher(string.substring(i, i + 2));
			if (matcher.find() == false) {
				System.out.println("No");
				break;
			}
			if (i == string.length() - 2) {
				System.out.println("Yes");
			}
		}

	}
}