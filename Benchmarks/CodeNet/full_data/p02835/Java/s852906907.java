
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	final long MOD = (long) (1e9 + 7);

	void run() {
		Scanner sc = new Scanner(System.in);
		long sum = 0;
		for (int i = 0; i < 3; ++i) {
			sum += sc.nextLong();
		}
		if(sum>=22) {
			System.out.println("bust");
		}else {
			System.out.println("win");
		}
	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
