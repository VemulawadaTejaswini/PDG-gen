import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final String S = s.next();
			int aa = Integer.parseInt(S.substring(0, 2));
			int bb = Integer.parseInt(S.substring(2, 4));

			String ret;
			if (1 <= aa && aa <= 12) {
				// MMbb
				if (1 <= bb && bb <= 12) {
					ret = "AMBIGUOUS";
				} else {
					ret = "MMYY";
				}
			} else {
				// YYbb
				if (1 <= bb && bb <= 12) {
					ret = "YYMM";
				} else {
					ret = "NA";
				}
			}
			System.out.println(ret);
		}
	}
}
