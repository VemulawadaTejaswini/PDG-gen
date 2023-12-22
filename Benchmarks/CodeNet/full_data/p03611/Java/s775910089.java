import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().execute();
	}

	public void execute() {
		Scanner sc = new Scanner(System.in);
		final int N = sc.nextInt();
		int[] counter = new int[10002];
		Arrays.fill(counter, 0);
		for (int i = 0; i < N; i++) {
			int ai = sc.nextInt();
			counter[ai]++;
			counter[ai + 1]++;
			counter[ai + 2]++;
		}
		
		int cnt = 0;
		for (int i=0; i<=N; i++) {
			cnt = Math.max(cnt, counter[i]);
		}
		System.out.println(cnt);
		sc.close();
	}
}