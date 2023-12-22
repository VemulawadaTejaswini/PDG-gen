import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int n = sc.nextInt();
		byte[] cc = sc.next().getBytes();
		int cnt = 0;
		for (int i = 2; i < n; i++)
			if (cc[i - 2] == 'A' && cc[i - 1] == 'B' && cc[i] == 'C')
				cnt++;
		println(cnt);
	}
}
