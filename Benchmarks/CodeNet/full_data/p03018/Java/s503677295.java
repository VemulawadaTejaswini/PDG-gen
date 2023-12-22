import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//AtCoder Grand Contest 034
//B	ABC
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		sc.close();

		int ans = 0;

		Pattern p = Pattern.compile("ABC");

		while (S.matches(".*ABC.*")) {
			Matcher m = p.matcher(S);
			while (m.find()) {
				ans++;
			}

			S = S.replace("ABC", "BCA");
		}

		System.out.println(ans);
	}
}
