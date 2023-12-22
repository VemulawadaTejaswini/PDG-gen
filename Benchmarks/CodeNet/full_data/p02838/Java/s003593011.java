import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	int MOD = 1000000007;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextLong();
		}
		long ans=0;
		for(int i=0; i<60; i++) {
			long x=0;
			for(int j=0; j<n; j++) {
				if( ((a[j]>>i)&1) == 1 ) {
					x++;
				}
			}
			long tmp=(x*(n-x))% MOD;
			for(int j=0; j<i; j++) {
				tmp = (tmp * 2) % MOD;
			}
			ans += tmp;
			ans %= MOD;
		}
		System.out.println(ans);
		sc.close();
	}
}