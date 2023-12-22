import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, cnt = 0, sum = 0;
		N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			for (int k = 1; k <= N; k++) {
				if (k % i == 0 && k % 2 != 0) {
					cnt++;
				}

			}
			if (cnt == 8) {
				sum++;
			}
			cnt = 0;
		}
		System.out.println(sum);
		sc.close();
	}

}