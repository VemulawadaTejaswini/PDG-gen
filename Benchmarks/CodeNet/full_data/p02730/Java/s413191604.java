import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	byte[] cc;
	boolean pal(int i, int j) {
		while (i < j) {
			if (cc[i] != cc[j])
				return false;
			i++; j--;
		}
		return true;
	}
	void main() {
		cc = sc.next().getBytes();
		int n = cc.length;
		int h = (n - 1) / 2;
		println(pal(0, n - 1) && pal(0, h - 1) && pal(h + 1, n - 1) ? "Yes" : "No");
	}
}
