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
		final int K = sc.nextInt();
		final int Q = sc.nextInt();

		final int[] score = new int[N+1];

		for(int i=1;i<=Q;i++) {
			int Ai = sc.nextInt();
			score[Ai]++;
		}

		for(int i=1;i<=N;i++) {
			if(K- Q + score[i] <= 0) {
				out.println("No");
			}else {
				out.println("Yes");
			}
		}

	}

}
