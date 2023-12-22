import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			String S = sc.next();
			Pattern pattern = Pattern.compile("01|10");
			// Matcher matcher = pattern.matcher(S);
			int count = 0;
			while (pattern.matcher(S).find()) {
				count += 2;
				int zeroOne = S.lastIndexOf("01");
				int oneZero = S.lastIndexOf("10");
				int index = Math.max(oneZero, zeroOne);
				S = S.substring(0, index) + S.substring(index + 2);
			}
			System.out.println(count);
		} // Scanner Close
	}
}