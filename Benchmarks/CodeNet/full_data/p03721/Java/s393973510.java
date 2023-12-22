import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int K = sc.nextInt();
		long[] n = new long[N * 100000];
		int x = 0;
		
		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int j = 0; j < b; j++) {
				n[x+j] = a;
			}
			x += b;
		}
		
		System.out.println(n[K-1]);

		sc.close();
	}
}
