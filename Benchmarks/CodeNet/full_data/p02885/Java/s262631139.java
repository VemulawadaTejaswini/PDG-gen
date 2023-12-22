import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception{
		new Main(new Scanner(System.in), System.out, System.err).exec();
	}
	private final Scanner sc;
	private final PrintStream out, err;
	public Main(final Scanner sc, final PrintStream out, final PrintStream err) {
		this.sc = sc;
		this.out = out;
		this.err = err;
	}

	public void exec() throws Exception{
		final int A = sc.nextInt();
		final int B = sc.nextInt();
		final int diff = A - B*2;
		if(diff < 0	) {
			out.println(0);
		}else {
			out.println(diff);
		}
	}
}
