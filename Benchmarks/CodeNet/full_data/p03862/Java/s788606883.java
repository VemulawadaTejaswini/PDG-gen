import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] ary = new int[n];
		for (int i = 0; i < n; i++) {
			ary[i] = sc.nextInt();
		}
		int sum = ary[0];
		int total = 0;
		for (int i = 1; i < n; i++) {
			sum = ary[i - 1] + ary[i];
			if (sum > x) {
				int hiku = sum - x;
				total += hiku;
				//right
				if (ary[i] >= hiku) {
					ary[i] -= hiku;
				} else if (ary[i] > 0) {
					ary[i] = 0;
					hiku -= ary[i];
				}
				// left
				if (hiku > 0) {
					ary[i - 1] -= hiku;
				}
			}
		}
		System.out.println(total);

	}
}