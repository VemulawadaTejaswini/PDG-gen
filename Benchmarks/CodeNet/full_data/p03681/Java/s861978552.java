import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	final long MOD = 1000000007;
	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();

		if(Math.abs(n-m)>1) {
			System.out.println(0);
			sc.close();
			return;
		}
		long ans = fact(n) * fact(m) % MOD;
		if(Math.abs(n-m)==0) {
			ans = ans * 2 % MOD;
		}
		System.out.println(ans);
		sc.close();
	}

	private long fact(long x) {
		long ans=1;
		for(long i=1; i<=x; i++) {
			ans = ans * i % MOD;
		}
		return ans;
	}
}
