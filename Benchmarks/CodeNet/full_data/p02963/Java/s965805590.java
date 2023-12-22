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
		final long S = sc.nextLong();
		final long M = 1000000000L;
		if(S == M*M) {
			out.print("0 0 "+M+" 0 0 "+M);
			return;
		}

		long x = M - S%M;
		long y = S/M + 1;
		out.print("0 0 "+M+" 1 "+x+ " " +y);
	}
}
