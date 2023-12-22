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
		final int[] h = new int[N];
		for(int i=0;i<N;i++) {
			h[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<N;i++) {
			if(h[i]>=K) {
				sum++;
			}
		}
		out.println(sum);
	}

}
