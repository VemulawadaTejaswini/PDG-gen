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
		byte[] cc = sc.next().getBytes();
		int n = cc.length;
		println((n % 2 == 1) == (cc[0] == cc[n - 1]) ? "Second" : "First");
	}
}
