// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	void main() {
		int n = sc.nextInt();
		int k = sc.nextInt();
		int c = sc.nextInt();
		byte[] aa = sc.next().getBytes();
		int[] pp = new int[k];
		int[] qq = new int[k];
		for (int h = 0, i = 0, o = i - c - 1; i < n; i++)
			if (aa[i] == 'o' && i - o > c) {
				pp[h] = o = i;
				if (++h == k)
					break;
			}
		for (int h = 0, i = n - 1, o = i + c + 1; i >= 0; i--)
			if (aa[i] == 'o' && o - i > c) {
				qq[k - 1 - h] = o = i;
				if (++h == k)
					break;
			}
		for (int h = 0; h < k; h++)
			if (pp[h] == qq[h])
				println(pp[h] + 1);
	}
}
