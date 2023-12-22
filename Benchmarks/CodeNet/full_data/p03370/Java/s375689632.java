import java.util.Scanner;

public class Main {
	void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int m = scan.nextInt();
			x -= m;
			min = Math.min(min, m);
		}
		System.out.println(n + (x / min));
	}
	public static void main(String[] args) {
		new Main().run();
	}
}
