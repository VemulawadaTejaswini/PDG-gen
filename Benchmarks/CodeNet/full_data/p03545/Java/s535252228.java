import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int ABCD = sc.nextInt();

		sc.close();

		int A = ABCD / 1000;
		int B = ABCD / 100 % 10;
		int C = ABCD / 10 % 10;
		int D = ABCD % 10;

		int ans = 0;
		for (int i = 0; i < 1 << 3; i++) {

			int res = A;

			if (((i >> 0) & 0x1) == 0) {
				res += B;
			} else {
				res -= B;
			}

			if (((i >> 1) & 0x1) == 0) {
				res += C;
			} else {
				res -= C;
			}

			if (((i >> 2) & 0x1) == 0) {
				res += D;
			} else {
				res -= D;
			}

			if (res == 7) {
				ans = i;
				break;
			}
		}

		StringBuilder sb = new StringBuilder();
		sb.append(A);
		sb.append(((ans >> 0) & 0x1) == 0 ? "+" : "-");
		sb.append(B);
		sb.append(((ans >> 1) & 0x1) == 0 ? "+" : "-");
		sb.append(C);
		sb.append(((ans >> 2) & 0x1) == 0 ? "+" : "-");
		sb.append(D);
		sb.append("=7");

		out.println(sb.toString());
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
