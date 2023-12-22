import java.util.Arrays;
import java.util.Scanner;

public class Main {
	int n;
	int[] a;
	void run() {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scan.nextInt();
		System.out.println(dfs(1, 0));
	}
	int dfs(int num, int depth) {
		if (depth == n) {
			if (num % 2 == 0)
				return 1;
			else
				return 0;
		}
		return dfs(num * a[depth],     depth + 1)
			 + dfs(num * (a[depth] + 1), depth + 1)
			 + dfs(num * (a[depth] - 1), depth + 1);
	}
	public static void main(String[] args) {
		new Main().run();
	}
}
