

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		StringBuilder sb = new StringBuilder();

		for (long i = 0; i < n; i++) {
			String input = scan.next();

			if (i < 2) {
				if (i == 0) {
					sb.append(input + ",");
					continue;
				} else if (i == 1 && sb.toString().equals(input + ",")) {
					System.out.println("NO");
					scan.close();
					return;
				}
			} else {
				Pattern p = Pattern.compile("," + input + ",");
			    Matcher m = p.matcher(sb.toString());
			    if (m.matches()) {
					System.out.println("NO");
					scan.close();
					return;
				}
			}

			sb.append(input + ",");
		}

		scan.close();
		System.out.println("YES");
	}
}
