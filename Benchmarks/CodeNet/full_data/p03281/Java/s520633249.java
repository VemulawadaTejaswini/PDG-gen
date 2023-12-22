import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int cnt, sum = 0, t;
		for (int i = 1; i <= n; i = i + 2) {
			cnt = 0;
			t = i;
			for (int j = 1; j <= i; j = j + 2) {
				if (t % j == 0) {
					cnt++;
				}
			}
			if (cnt == 8) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
