import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static void exec(Scanner in, PrintStream out) {
		int N = in.nextInt();
		int K = in.nextInt();
		int[] count = new int[N];
		for (int i = 0; i < N; i += 1) {
			count[in.nextInt() - 1] += 1;
		}
		Arrays.sort(count);
		int sum = 0;
		for (int i = 0; i < N - K; i += 1) {
			sum += count[i];
		}
		out.println(sum);
	}

	public static void main(String[] args) {
		exec(new Scanner(System.in), System.out);
	}

}
