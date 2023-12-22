import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean f = false;
		int min = Integer.MAX_VALUE-1;
		int n = scan.nextInt();
		int T = scan.nextInt();
		int[] c = new int[n];
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = scan.nextInt();
			t[i]  = scan.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (t[i] <= T) {
				f = true;
				if (c[i] <= min) {
					min = c[i];
				}
			}
		}
		if (f) {
			System.out.println(min);
		} else {
			System.out.println("TLE");
		}
	}
}
