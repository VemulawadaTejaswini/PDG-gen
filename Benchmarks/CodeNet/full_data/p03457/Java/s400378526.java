import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = Integer.parseInt(sc.next());
			int t[] = new int[n + 1];
			int x[] = new int[n + 1];
			int y[] = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				t[i] = Integer.parseInt(sc.next());
				x[i] = Integer.parseInt(sc.next());
				y[i] = Integer.parseInt(sc.next());
			}
			for (int i = 0; i < n; i++) {
				int diff = Math.abs(x[i] - x[i + 1]) + Math.abs(y[i] - y[i + 1]);
				int time = t[i + 1] - t[i];
				if (diff > time || (diff - time) % 2 != 0) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
		}
	}
}