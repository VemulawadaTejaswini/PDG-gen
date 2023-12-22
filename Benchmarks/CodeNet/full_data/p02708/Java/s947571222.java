import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		long MOD = 1000000007;
		long n=sc.nextLong();
		n++;
		long k=sc.nextLong();
		long ans = 0;
		for(long i=k; i<=n; i++) {
			long max = n*(n+1)/2 - (n-i)*(n-i+1)/2;
			long min = i*(i+1)/2;
			ans = (ans + (max - min + 1)) % MOD;
		}
		System.out.println(ans);
		sc.close();
	}

}


