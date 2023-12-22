import java.util.Arrays;
import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean[] isPrime = isPrimeN(100000);

		int[] sum = new int[100001];
		sum[0] = 0;
		for(int i=1; i<=100000; i+=2) {
			if(like2017(i, isPrime))
				sum[i] = sum[i-1] + 1;
			else
				sum[i] = sum[i-1];

			sum[i+1] = sum[i];
		}

		int Q = sc.nextInt();
		for(int i=0; i<Q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			System.out.println(sum[r]-sum[l-1]);
		}

	}

	public static boolean like2017(int n, boolean[] isPrime) {
		if(n % 2 == 0)
			return false;

		if(isPrime[n] && isPrime[(n+1)/2])
			return true;
		else
			return false;
	}

	//n以下のすべての数の高速な素数判定(エラトステネスの篩)
	public static boolean[] isPrimeN(int n) {

		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;

		int sqrt = (int)Math.sqrt(n);

		//割れる数はsqrt以下
		for(int i=2; i<=sqrt; i++) {
			if(isPrime[i]) {
				for(int j=i*i; j<=n; j+=i) {
					isPrime[j] = false;
				}
			}
		}

		return isPrime;
	}

}
