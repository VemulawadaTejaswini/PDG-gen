import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		sc.nextInt();
		int k = sc.nextInt();
		
		char[] s = sc.next().toCharArray();
		
		s[k - 1] = (char)(s[k - 1] - 'A' + 'a');
		
		pr.println(s);
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
