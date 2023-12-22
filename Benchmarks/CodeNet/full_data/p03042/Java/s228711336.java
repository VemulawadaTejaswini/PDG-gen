import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	boolean isMM(String s) {
		int m = Integer.parseInt(s);
		if (m >= 1 && m <= 12) {
			return true;
		}
		return false;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String s = sc.next();

		String s1 = s.substring(0, 2);
		String s2 = s.substring(2);

		String ans;
		if (isMM(s1) && isMM(s2)) {
			ans = "AMBIGUOUS";
		} else if (isMM(s1)) {
			ans = "MMYY";
		} else if (isMM(s2)) {
			ans = "YYMM";
		} else {
			ans = "NA";
		}

		out.println(ans);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
