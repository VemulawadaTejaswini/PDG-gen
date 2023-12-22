import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = 100001;
		long[]k = new long[m];
		int N = scan.nextInt();
		long K = scan.nextLong();
		for(int i = 0; i < N; i++) {
			int a = scan.nextInt();
			long b = scan.nextInt();
			k[a] += b;
		}

		long cnt = 0;
		for(int i = 1; i < m; i++) {
			cnt += k[i];
			if(cnt >= K) {
				System.out.println(i);
			}
		}
	}
}
