import java.util.*;

// ABC 79-D
// https://beta.atcoder.jp/contests/abc079/tasks/abc079_d

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int A = in.nextInt();
		int B = in.nextInt();
		System.out.println(Math.min(N * A, B));
	}
}
