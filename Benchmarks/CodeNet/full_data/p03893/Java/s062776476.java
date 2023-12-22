
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		long ok = Long.MAX_VALUE / 3;
		long ng = 0;
		while (ok - ng > 1) {
			long m = (ok + ng) / 2;
			if (f(m) > X) {
				ok = m;
			} else {
				ng = m;
			}
		}
		System.out.println(ok - 1);
	}

	static int f(long n) {
		if (n <= 2)
			return 0;
		return 1 + f((n - 1) / 2);
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
