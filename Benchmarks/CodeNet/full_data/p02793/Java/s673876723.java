
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];

		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}

		int factor[] = new int[1000000];
		for(int i = 0; i < n; i++){
			int num = a[i];

			int div = 2;
			while(num > 1){
				int count = 0;
				while(num % div == 0){
					num /= div;
					count++;
				}

				factor[div] = Math.max(factor[div], count);
//				System.out.println(div +" appear "+count);
				div++;
			}
		}

		long commonVal = 1;
		int mod = 1_000_000_007;
		for(int i = 2; i < factor.length; i++){
			commonVal *= repeatablePow(i, factor[i], mod);
			commonVal %= mod;
		}

//		System.out.println(commonVal);
		long result = 0;

		for(int i = 0; i < n; i++){
			result += commonVal*repeatablePow(a[i], mod - 2, mod)%mod;
			result %= mod;
//			System.out.println(result);
		}

		System.out.println(result);

	}

	static long repeatablePow(int x, int n, int mod){
		if(n == 0){
			return 1;
		}
		long result = repeatablePow((int)((long)x*x%mod), n/2, mod);
		if(n % 2 == 1){
			result = result*x%mod;
		}
		return result;
	}

}
