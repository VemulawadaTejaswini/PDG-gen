import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		new Main(new Scanner(System.in), System.out, System.err).exec();
	}
	public final Scanner sc;
	public final PrintStream out, err;
	public Main(final Scanner sc, final PrintStream out, final PrintStream err) {
		this.sc = sc;this.out = out;this.err = err;
	}
	static private final long pair(int a, int b) {return (((long)a) << 32) + b;}
	static private final int upper(long v) {return (int)(v >> 32);}
	static private final int lower(long v) {return (int)(v & 0xFFFFFFFF);}

	//-----------------------------------------

	static private final long load(int end, int length) {
		return pair(end, length);
	}
	static private final int end(long load) {
		return upper(load);
	}
	static private final int length(long load) {
		return lower(load);
	}
	static private final long score(int count, int last) {
		return pair(count, last);
	}
	static private final int count(long score) {
		return upper(score);
	}
	static private final int last(long score) {
		return lower(score);
	}

	//------------------------------------------

	public void exec() throws Exception{
		final int N = sc.nextInt();
		final String S = sc.next();
		if(N%2 == 1) {
			out.println("No");
			return;
		}
		for(int i=0;i<N/2;i++) {
			if(S.charAt(i)!=S.charAt(i+N/2)) {
				out.println("No");
				return;
			}
		}
		out.println("Yes");
	}
}
