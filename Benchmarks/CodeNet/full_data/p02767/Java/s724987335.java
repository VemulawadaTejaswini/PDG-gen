import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] x = new int[n];
		int max = 0;
		int min = 100;

		for(int i = 0;i < n;i++) {
			x[i] = stdIn.nextInt();
			max = Math.max(max, x[i]);
			min = Math.min(min, x[i]);
		}


		int cost = Integer.MAX_VALUE;

		for(int i = min;i<=max;i++) {
			int ans = 0;
			for(int j = 0;j < n;j++) {
				ans = ans + ((x[j]-i)*(x[j]-i));
			}
			cost = Math.min(cost, ans);
		}

		System.out.println(cost);

	}

}
