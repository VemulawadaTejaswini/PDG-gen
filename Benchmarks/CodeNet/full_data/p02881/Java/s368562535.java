import java.io.*;
import java.util.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long ans = N - 1;
		for (long i = 2; i * i <= N; ++i) {
			if (N % i != 0)
				continue;
			ans = Math.min(ans, (i - 1) + (N / i - 1));
		}
		System.out.println(ans);
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
