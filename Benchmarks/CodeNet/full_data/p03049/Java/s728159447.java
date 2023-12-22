import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();

		int countAB = 0;
		int A = 0;
		int B = 0;
		int BA = 0;

		for (int i = 0; i < N; i++) {
			String s = sc.next();

			if (s.indexOf("AB") >= 0) {
				countAB++;
			}

			if (s.startsWith("B") && s.endsWith("A")) {
				BA++;
			} else if (s.startsWith("B")) {
				B++;
			} else if (s.endsWith("A")) {
				A++;
			}
		}

		int ans = 0;

		int state = 0;
		for (;;) {
			switch (state) {
			case 0: //start
				if (A > 0) {
					A--;
					state = 1; //A
				} else if (BA > 0) {
					BA--;
					state = 1; //A
				} else {
					state = 3; //end
				}
				break;
			case 1: //A
				if (BA > 0) {
					BA--;
					state = 1;
					ans++;
				} else if (B > 0) {
					B--;
					state = 2; //x
					ans++;
				} else {
					state = 3;
				}
				break;
			case 2: //B
				if (A > 0) {
					A--;
					state = 1;
				} else {
					state = 3;
				}
				break;
			}
			if (state == 3) {
				break;
			}
		}

		out.println(ans + countAB);

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
