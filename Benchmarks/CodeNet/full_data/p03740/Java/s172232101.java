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
		long x = sc.nextLong();
		long y = sc.nextLong();
		println(Math.abs(x - y) > 1 ? "Alice" : "Brown");
	}
}
