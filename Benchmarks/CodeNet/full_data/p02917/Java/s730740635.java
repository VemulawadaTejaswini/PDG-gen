import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = null;
		PrintStream out = null;
		try {
			sc = new Scanner(System.in);
			out = System.out;
			exec(sc, out);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		} finally {
			if(out != null) {
				out.close();
			}
			if(sc != null) {
				sc.close();
			}
		}
		System.exit(0);
	}
	public static void exec(final Scanner sc, final PrintStream out) throws Exception{
		final int N = sc.nextInt();
		final int B[] = new int[N-1];

		for(int i=0;i<N-1;i++) {
			B[i] = sc.nextInt();
		}

		int score = B[0];
		for(int i=1;i<N-1;i++) {
			score += Math.min(B[i-1], B[i]);
		}
		score += B[N-2];

		out.println(score);
	}
}
