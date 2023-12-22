import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int[] a = new int[3];
		int[] b = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
		}

		int[] cnt = new int[4];
		for (int i = 0; i < 3; i++) {
			cnt[a[i]]++;
			cnt[b[i]]++;
		}
		
		for (int i = 0; i < 4; i++) {
			if (cnt[i] > 2) {
				pr.println("NO");
				return;
			}
		}
		
		pr.println("YES");
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
