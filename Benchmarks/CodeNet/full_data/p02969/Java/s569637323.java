import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt();
		System.out.println(3*r*r);
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}