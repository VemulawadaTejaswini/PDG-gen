import java.util.Scanner;

public class Main {
	public void run() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		double ans = 0;
		for (int i = 1; i <= n; i++) {
			int tmp = i;
			int j = 0;
			for (j = 0; tmp < k; j++)
				tmp *= 2;
			if (j == 0)
				ans += 1 / (double) n;
			else
				ans += Math.pow((double)1 / 2, j) * (1 / (double) n);
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		new Main().run();
	}

}
