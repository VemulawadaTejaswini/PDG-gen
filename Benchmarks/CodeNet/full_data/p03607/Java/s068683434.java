import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		Set<Integer> m = new HashSet<>();

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if (m.contains(a)) {
				m.remove(a);
			} else {
				m.add(a);
			}
		}

		sc.close();

		out.println(m.size());

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
