import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] w = new int[n];
		for (int i = 0; i < n; i++) {
			w[i] = sc.nextInt();
		}

		int[] cumsum = new int[n + 1];
		for (int i = 0; i < n; i++) {
			cumsum[i + 1] = cumsum[i] + w[i];
		}

		int min = Integer.MAX_VALUE;
		for (int i = 1; i < n; i++) {
			min = Math.min(min, Math.abs(cumsum[n] - cumsum[i] - cumsum[i]));
		}
		
		pr.println(min);
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
