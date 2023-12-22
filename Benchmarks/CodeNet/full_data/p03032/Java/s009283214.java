import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	static Deque<Integer>	dq	= new ArrayDeque<Integer>();
	static int				max	= 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt();
		for ( int i = 0; i < n; i++ ) {
			dq.add(in.nextInt());
		}
		in.close();
		brute(k, 0);
		System.out.println(max);
	}

	public static void brute(int k, int sum) {
		// System.out.println("k:" + k + "  sum:" + sum);
		if ( k <= 0 || dq.isEmpty() ) {
			max = Math.max(max, sum);
			return;
		}

		int left = dq.pollFirst();
		brute(k - 1, sum + left);
		if ( left < 0 ) {
			brute(k - 2, sum);
		}
		dq.addFirst((Integer) left);

		int right = dq.pollLast();
		brute(k - 1, sum + right);
		if ( right < 0 ) {
			brute(k - 2, sum);
		}
		dq.addLast((Integer) right);
	}
}