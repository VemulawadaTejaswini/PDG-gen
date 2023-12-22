import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		char b = sc.next().toCharArray()[0];

		if (b == 'A') {
			pr.println('T');
		} else if (b == 'T') {
			pr.println('A');
		} else if (b == 'C') {
			pr.println('G');
		} else if (b == 'G') {
			pr.println('C');
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
