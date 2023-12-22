import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char[] s = sc.next().toCharArray();
		
		int s1 = (s[0] - '0') * 10 + s[1] - '0';
		int s2 = (s[2] - '0') * 10 + s[3] - '0';

		boolean f1 = s2 <= 12 && s2 > 0;
		boolean f2 = s1 <= 12 && s1 > 0;
		if (f1 && f2) {
			pr.println("AMBIGUOUS");
		} else if (f1) {
			pr.println("YYMM");
		} else if (f2) {
			pr.println("MMYY");
		} else {
			pr.println("NA");
		}
	}

	// ---------------------------------------------------
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		pr = new Printer(System.out);
			
		solve();
			
		pr.close();
		sc.close();
	}

	static class Printer extends PrintWriter {
		Printer(OutputStream out) {
			super(out);
		}
	}
}
