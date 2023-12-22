import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static Scanner in;
	static PrintWriter out;

	static void solve() {
		String S = in.nextLine();
		out.print(S.charAt(0));
		int length = S.length();
		out.print(length-2);
		out.println(S.charAt(length-1));
	}

	public static void main(String[] args) {
		in = new Scanner(System.in);
		out = new PrintWriter(System.out);
		solve();
		out.flush();
		out.close();
		in.close();
	}

}
