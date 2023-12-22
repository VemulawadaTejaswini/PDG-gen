import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		D solver = new D();
		solver.solve(1, in, out);
		out.close();
	}

	static class D {
		public void solve(int testNumber, Scanner in, PrintWriter out) {
			String nn = in.next();
			int n = in.nextInt();
			List<String> s = new LinkedList<>();
			s.add(nn);

			boolean reverse = false;
			for (int i = 0; i < n; i++) {
				int t = in.nextInt();

				if (t == 1) {
					reverse = !reverse;
				} else {
					int f = in.nextInt();
					if (f == 1) {
						if (!reverse) {
							s.add(0, in.next());
						} else {
							s.add(in.next());
						}
					} else {
						if (!reverse) {
							s.add(in.next());
						} else {
							s.add(0, in.next());
						}
					}
				}
			}
			if (reverse) {
				for (int i = s.size(); i > 0; i--) {
					out.print(s.get(i - 1));
				}
			} else {
				out.println(String.join("", s.toArray(new String[0])));
			}
		}

	}
}

