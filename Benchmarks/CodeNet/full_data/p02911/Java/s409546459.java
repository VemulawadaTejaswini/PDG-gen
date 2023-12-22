import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().doIt();
	}

	int N, K, Q = 0;

	protected void doIt() {
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		K = scan.nextInt();
		Q = scan.nextInt();
		String nextLine = System.lineSeparator();
		int[] correct = new int[N];
		for (int i=0; i < Q; i++) {
			int correcter = scan.nextInt();
			correct[correcter - 1]++;
		}

		StringBuilder sb = new StringBuilder();
		for (int i=0; i < N; i++) {
			int point = K - Q + correct[i];
			if (point > 0) {
				sb.append("Yes" + nextLine);
			}
			else {
				sb.append("No" + nextLine);
			}
		}
		System.out.println(sb);
	}
}
