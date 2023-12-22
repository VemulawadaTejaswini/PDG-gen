import java.io.PrintStream;
import java.util.Scanner;

public class Main {

	static void exec(Scanner in, PrintStream out) {
		in.nextInt();
		int Q = in.nextInt();
		String S = in.next();
		for (int i = 0; i < Q; i += 1) {
			int l = in.nextInt();
			int r = in.nextInt();
			int count = 0;
			for (int toffset = l - 1; toffset + "AC".length() <= r;) {
				if (S.startsWith("AC", toffset)) {
					count += 1;
					toffset += "AC".length();
				} else {
					toffset += 1;
				}
			}
			out.println(count);
		}
	}

	public static void main(String[] args) {
		exec(new Scanner(System.in), System.out);
	}

}
