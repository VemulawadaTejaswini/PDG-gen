// practice with kaiboy
import java.io.*;
import java.util.*;

public class Main extends PrintWriter {
	Main() { super(System.out, true); }
	Scanner sc = new Scanner(System.in);
	public static void main(String[] $) {
		Main o = new Main(); o.main(); o.flush();
	}

	int n; int[] aa;
	void solvep(int ip) {
		int m = n - 1;
		for (int i = 0; i < n; i++)
			if (aa[i] < 0)
				m++;
		println(m);
		for (int i = 0; i < n; i++)
			if (aa[i] < 0)
				println((ip + 1) + " " + (i + 1));
		for (int i = 1; i < n; i++)
			println(i + " " + (i + 1));
	}
	void solveq(int iq) {
		int m = n - 1;
		for (int i = 0; i < n; i++)
			if (aa[i] > 0)
				m++;
		println(m);
		for (int i = 0; i < n; i++)
			if (aa[i] > 0)
				println((iq + 1) + " " + (i + 1));
		for (int i = n; i > 1; i--)
			println(i + " " + (i - 1));
	}
	void main() {
		n = sc.nextInt();
		aa = new int[n];
		for (int i = 0; i < n; i++)
			aa[i] = sc.nextInt();
		int ip = -1, iq = -1;
		for (int i = 0; i < n; i++)
			if (aa[i] > 0 && (ip == -1 || aa[ip] < aa[i]))
				ip = i;
			else if (aa[i] < 0 && (iq == -1 || aa[iq] > aa[i]))
				iq = i;
		if (ip != -1 && iq == -1)
			solvep(ip);
		else if (ip == -1 && iq != -1)
			solveq(iq);
		else if (ip != -1 && iq != -1) {
			if (aa[ip] + aa[iq] >= 0)
				solvep(ip);
			else
				solveq(iq);
		} else
			println(0);
	}
}
