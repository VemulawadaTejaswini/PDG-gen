import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int[] abcde = new int[5];
		for (int i = 0; i < 5; i++) {
			abcde[i] = sc.nextInt();
		}
		int k = sc.nextInt();

		int cnt = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (abcde[j] - abcde[i] <= k) {
					cnt++;
				}
			}
		}

		if (cnt < 10) {
			pr.println(":(");
		} else {
			pr.println("Yay!");
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
