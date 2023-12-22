import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	int fun(int a, int b, int c, int d, int e, int f) {
		return a * 100 + b * 101 + c * 102 + d * 103 + e * 104 + f * 105;
	}

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int X = sc.nextInt();

		sc.close();

		int Z = 1000;

		for (int a = 0; a < Z; a++) {
			if (fun(a, 0, 0, 0, 0, 0) > X) {
				break;
			}
			for (int b = 0; b < Z - a; b++) {
				if (fun(a, b, 0, 0, 0, 0) > X) {
					break;
				}
				for (int c = 0; c < Z - (a + b); c++) {
					if (fun(a, b, c, 0, 0, 0) > X) {
						break;
					}
					for (int d = 0; d < Z - (a + b + c); d++) {
						if (fun(a, b, c, d, 0, 0) > X) {
							break;
						}
						for (int e = 0; e < Z - (a + b + c + d); e++) {
							if (fun(a, b, c, d, e, 0) > X) {
								break;
							}
							for (int f = 0; f < Z - (a + b + c + d + e); f++) {
								int q = fun(a, b, c, d, e, f);
								if (q == X) {
									out.println(1);
									return;
								}
								if (q > X) {
									break;
								}
							}
						}
					}
				}
			}
		}

		out.println(0);

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
