
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long A = in.nextLong();
		long B = in.nextLong();
		long C = in.nextLong();
		long D = in.nextLong();
		long E = in.nextLong();
		long minMove = Math.min(A, Math.min(B, Math.min(C, Math.min(D, E))));
		long ans = ((N + minMove - 1) / minMove) + 4;
		System.out.println(ans);
		in.close();
	}
}