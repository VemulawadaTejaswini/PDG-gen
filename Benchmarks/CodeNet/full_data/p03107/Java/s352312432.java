import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String s = sc.next();

		int n = 0;
		Deque<Character> stack = new ArrayDeque<>(100000);
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);

			Character t = stack.peek();
			if (t != null) {
				if ((c == '1' && t == '0') || (c == '0' && t == '1')) {
					stack.removeFirst();
					n += 2;
				} else {
					stack.push(c);
				}
			} else {
				stack.push(c);
			}

		}
		out.println(n);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
