import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int cubeSize = S.length();

		Pattern p = Pattern.compile("01|10");

		while (true) {
			S = replaceByHand(S, "01", "");
			S = replaceByHand(S, "10", "");
			if (!p.matcher(S).find()) {
				break;
			}
		}

		System.out.println(cubeSize - S.length());
	}

	private static String replaceByHand(final String original, final String old, final String replace) {
	    int offset = 0;
	    StringBuilder builder = new StringBuilder(original.length());
	    int index;
	    while (0 <= (index = original.indexOf(old, offset))) {
	        builder.append(original, offset, index);
	        builder.append(replace);
	        offset = index + old.length();
	    }
	    builder.append(original, offset, original.length());
	    return builder.toString();
	}
}