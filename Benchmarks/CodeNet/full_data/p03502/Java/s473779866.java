
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % f(n) == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	int f(int n) {
		int ret = 0;
		while (n > 0) {
			ret += n % 10;
			n /= 10;
		}
		return ret;
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}

}
