
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = sc.nextLong();
		long[] a = new long[n + 1];
		long[] sum = new long[n + 1];
		sum[0] = 0;
		for(int i = 1; i < n + 1; i++) {
			a[i] = sc.nextLong();
			sum[i] = sum[i - 1] + a[i];
		}
		long cnt = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n + 1; j++) {
				if((sum[j] - sum[i]) % m == 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);

	}

}
