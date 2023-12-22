import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String S = " " + sc.nextLine() + " ";
		String reg = "BW";

		int count = S.split(reg).length -1;

		while(true) {
			S = replaceByHand(S, reg, "WB");
			count += S.split(reg).length -1;

			if (S.split(reg).length == 1) {
				break;
			}
		}

		System.out.println(count);
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