import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

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
		C solver = new C();
		solver.solve(1, in, out);
		out.close();
	}

	static class C {
		public void solve(int testNumber, Scanner in, PrintWriter out) {
			int a = in.nextInt(), b = in.nextInt();

			int result = -1;
			for (int x = 0; ((int) (x * 0.08)) <= a; x++) {
				if (((int) (x * 0.08) == a) && ((int) (x * 0.1) == b)) {
					result = x;
					break;
				}
			}
			out.println(result);
		}

	}
}

