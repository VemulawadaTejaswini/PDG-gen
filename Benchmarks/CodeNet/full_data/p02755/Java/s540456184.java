import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int p = b * 10; p < (b + 1) * 10; p++)
			if (p * 8 / 100 == a) {
				println(p);
				return;
			}
		println(-1);
	}
}
