
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int Q = in.nextInt();
		String S = in.next();

		Pattern pattern = Pattern.compile("AC");

		for (int i = 0; i < Q; i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			String SQ = S.substring(l - 1, r);
			Matcher matcher = pattern.matcher(SQ);
			long count = 0;
			while (matcher.find()) {
				count++;
			}
			System.out.println(count);
		}
	}
}
