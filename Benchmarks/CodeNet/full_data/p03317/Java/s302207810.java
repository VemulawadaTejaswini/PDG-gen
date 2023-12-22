import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int p = 0;
		for(int i = 0; i < N; i++) {
			int a = scan.nextInt();
			if(a == 1) {
				p = i;
			}
		}
		scan.close();
		if(N == K) {
			System.out.println(1);
			System.exit(0);
		}

		int r = 0;
		int l = 0;
		int min = N;
		int m = K - 1;
		for(int i = 0; i < K; i++) {
			int cnt = 1;
			l = p - m + i;
			r = p + i;
			if(l > 0) {
				while(l > 0) {
					l = l - m;
					cnt ++;
				}
			}else {
				cnt ++;
			}
			if(r < N - 1) {
				while(r < N - 1) {
					r = r + m;
					cnt ++;
				}
			}else {
				cnt ++;
			}
			if(min > cnt) {
				min = cnt;
			}
		}
		System.out.println(min);

	}
}