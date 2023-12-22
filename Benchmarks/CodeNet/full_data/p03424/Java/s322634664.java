import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		Set<String> s = new HashSet<>();

		for (int i = 0; i < N; i++) {
			s.add(sc.next());
		}

		sc.close();

		if (s.size() == 3) {
			out.println("Three");
		} else {
			out.println("Four");
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
