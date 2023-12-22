import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		int N = sc.nextInt();
		int Y = sc.nextInt();

		int[] ans = null;
		for(int m=0;m<=N;m++) {
			for(int g=0;g<=N-m;g++) {
				int s = N-(m+g);
				if(Y == m*10000 + g*5000 + s*1000) {
					ans = new int[] {m,g,s};
				}
			}
		}

		if (ans == null) {
			out.println("-1 -1 -1");
		} else {
			out.println(ans[0] + " " + ans[1] + " " + ans[2]);
		}

		sc.close();

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

}
