import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();

		int ans = Integer.MAX_VALUE;
		for (int i = 1; i <= 100; i++) {
			int sum = 0;
			for (int j = 0; j < x.length; j++) {
				int val = x[j] - i;
				sum += val * val;
			}
			ans = Math.min(ans, sum);
		}
		System.out.println(ans);
	}
}
