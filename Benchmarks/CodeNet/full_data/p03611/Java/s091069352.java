import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cnt = new int[100000];
		for (int i = 0; i < n; i++) {
			cnt[sc.nextInt()]++;
		}
		sc.close();

		int ans = 0;
		for (int i = 1; i < 99999; i++) {
			int sum = cnt[i - 1] + cnt[i] + cnt[i + 1];
			ans = Math.max(ans, sum);
		}
		System.out.println(ans);
	}
}
