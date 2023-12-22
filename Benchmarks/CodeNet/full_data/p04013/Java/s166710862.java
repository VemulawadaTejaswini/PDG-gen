import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double A = sc.nextInt();
		double[] x = new double[N];
		for(int i = 0 ; i < N ; i++) {
			x[i] = sc.nextInt();
		}
		long ans = 0;
		for(int mask = 0 ; mask < (1 << N) ; mask++) {
			double total = 0;
			long cnt = 0;
			for(int i = 0 ; i < N ; i++) {
				if((mask & (1 << i)) != 0) {
					total += x[i];
					cnt++;
				}
			}
			if(cnt != 0) {
				if(total / cnt == A) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
}
