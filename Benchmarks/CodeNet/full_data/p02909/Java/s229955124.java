import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		final String S = sc.next();

		sc.close();

		String ans = null;
		switch (S) {
		case "Sunny":
			ans = "Cloudy";
			break;
		case "Cloudy":
			ans = "Rainy";
			break;
		case "Rainy":
			ans = "Sunny";
			break;

		}

		out.println(ans);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
