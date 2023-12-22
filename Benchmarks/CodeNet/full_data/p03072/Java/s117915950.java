import java.io.*;
import java.util.Scanner;


public class Main {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		int[] h = new int[n];
		for (int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = 0; j < i; j++) {
				if (h[j] > h[i]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				cnt++;
			}
		}

		pr.println(cnt);
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
