import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		String T = in.next();
		StringBuilder pattern = new StringBuilder();
		char[] c = T.toCharArray();
		for (int i = 0; i < c.length; i++) {
			pattern.append("[");
			pattern.append(c[i]);
			pattern.append("|?]");
		}
		String ans = "UNRESTORABLE";
		if (S.matches(".*" + pattern.toString() + ".*")) {
			ans = S.replaceFirst(pattern.toString(), T).replace("?", "a");
		}
		System.out.println(ans);
		in.close();
	}
}