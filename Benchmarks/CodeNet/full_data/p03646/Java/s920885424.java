// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		long k = sc.nextLong();
		int n = 50;
		int r = (int) (k % n);
		println(n);
		for (int i = 0; i < r; i++)
			print(n - 1 + 1 + k / n + " ");
		for (int i = r; i < n; i++)
			print(n - 1 - r + k / n + " ");
		println();
	}
}
