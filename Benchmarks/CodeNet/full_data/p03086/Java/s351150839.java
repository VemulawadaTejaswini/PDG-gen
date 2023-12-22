import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String s = sc.next();

		Pattern p = Pattern.compile("(A|C|G|T)*");
		Matcher m = p.matcher(s);

		int ans = 0;
		while (m.find()) {
			ans = Math.max(ans,
					m.end() - m.start());
		}
		out.println(ans);
		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
