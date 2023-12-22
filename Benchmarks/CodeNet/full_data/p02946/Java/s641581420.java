import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		int L = Math.max(-1000000, X - K + 1);
		int R = Math.min(1000000, X + K - 1);
		for (int i = L; i <= R; ++i) {
			System.out.print(i + (i == R ? "\n" : " "));
		}
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
