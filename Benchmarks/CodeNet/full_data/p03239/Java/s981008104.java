import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();
		int T = sc.nextInt();
		
		int[] c = new int[n];
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		int mini = -1;
		for (int i = 0; i < n; i++) {
			if (t[i] <= T && c[i] < min) {
				min = c[i];
				mini = i;
			}
		}
		
		if (mini == -1) {
			pr.println("TLE");
		} else {
			pr.println(c[mini]);
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
