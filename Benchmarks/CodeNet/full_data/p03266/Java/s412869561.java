

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int sum0 = 0;
		int sum1 = 0;
		for(int i=1; i<=N; ++i) {
			if(i % K == 0) {
				sum0++;
			}
			else if(i%K == (K/2) && K%2==0) {
				sum1++;
			}
		}
		long ans = sum0*sum0*sum0;
		ans += sum1*sum1*sum1;
		System.out.println(ans);
	}
}
