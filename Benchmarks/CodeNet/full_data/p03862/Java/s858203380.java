import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long x = sc.nextLong();
		long[]a = new long[N];
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextLong();
		}
		sc.close();
		long cnt = 0;
		for(int i = 1; i < N; i++) {
			long t = a[i] + a[i - 1];
			if(t > x) {
				long res = t - x;
				cnt += res;
				if(a[i] >= res) {
					a[i] -= res;
				}else {
					a[i - 1] -= res - a[i];
					a[i] = 0;
				}
			}
		}
		System.out.println(cnt);
	}
}