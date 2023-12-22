import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(Math.min(a * n, b));
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
