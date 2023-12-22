import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		char[] S = in.next().toCharArray();
		int[] E = new int[N + 1];
		int[] W = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			E[i] += E[i - 1] + (S[i - 1] == 'E' ? 1 : 0);
			W[i] += W[i - 1] + (S[i - 1] == 'W' ? 1 : 0);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int count = 0;
			count += W[i + 1] - (S[i] == 'W' ? 1 : 0);
			count += E[E.length - 1] - E[i + 1];
			ans = Math.min(ans, count);
		}
		System.out.println(ans);
		in.close();
	}
}