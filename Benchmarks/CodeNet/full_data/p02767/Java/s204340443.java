import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		sc.close();

		int min = x[0];
		int max = x[0];
		for(int i = 0; i < n; i++) {
			min = Math.min(x[i], min);
			max = Math.max(x[i], max);
		}
		int ans = Integer.MAX_VALUE;
		for(int i = min; i <= max; i++) {
			int cost = 0;
			for(int j = 0; j < n; j++) {
				cost += (x[j] - i) * (x[j]-i);
			}
			ans = Math.min(cost, ans);
		}
		System.out.println(ans);
	}

}
