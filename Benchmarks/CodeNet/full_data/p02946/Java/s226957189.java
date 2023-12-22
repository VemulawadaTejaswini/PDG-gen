import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int k = sc.nextInt();
		int x = sc.nextInt();

		boolean flag = false;
		for (int i = x - k + 1; i <= x + k- 1; i++) {
			if (!flag) {
				flag = true;
			} else {
				pr.print(" ");
			}
			pr.print(i);
		}
		pr.println();
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
