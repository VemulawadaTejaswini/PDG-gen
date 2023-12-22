import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main implements Runnable {
	public static void main(String[] args) {
		new Main().run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		double p = sc.nextDouble();
		p /= 100;
		if (x % 2 == 1) {
			++x;
		}
		x /= 2;
		System.out.println(x / p);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
