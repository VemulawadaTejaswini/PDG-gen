import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int n = 0;
		int m = 0;

		if(K % 2 != 0) {
			for (int i = 1; i <= N; i++) {
				if(i % K == 0) {
					n++;
				}
			}
			System.out.println(n * n * n);
		}
		else {
			for (int i = 1; i <= N; i++) {
				if(i % K == 0) {
					n++;
				}
				if(i % K == K / 2) {
					m++;
				}
			}
			System.out.println(n * n * n + m * m * m);
		}

		return;
	}
}
