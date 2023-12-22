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
		int c = sc.nextInt();
		println(c + " " + a + " " + b);
	}
}
