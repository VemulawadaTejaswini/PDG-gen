import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	static Scanner in;
	static PrintWriter out;
	static void solve() {
		String answer = "";
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		if (n % 2 == 0) {
			for(int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					answer = answer + String.valueOf(a[i]) + " ";
				} else {
					answer = String.valueOf(a[i]) + " " + answer;
				}
			}			
		} else {
			for(int i = 0; i < n; i++) {
				if (i % 2 == 0) {
					answer = String.valueOf(a[i]) + " " + answer;
				} else {
					answer = answer + String.valueOf(a[i]) + " ";					
				}
			}
		}
		System.out.println(answer);
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
