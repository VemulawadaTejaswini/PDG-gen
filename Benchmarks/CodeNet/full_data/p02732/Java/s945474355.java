
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i =0;  i<N; i++){
			A[i] = sc.nextInt();
		}
		int[] count = new int[N];

		for(int a : A) {
			count[a-1] ++;
		}

		long[] choice2 = new long[N+1];
		combination.intFactorial();
		for(int i=0; i<N+1; i++) {
			choice2[i] = combination.comb(i, 2);
			//System.out.println(choice2[i]);
		}

		for(int k=0; k < N; k++) {
			long sum = 0;
			for(int i =0;  i<N; i++) {
				if(i == A[k]-1) {
					//System.out.print(count[i]-1 + " ");
					try{
						sum += choice2[count[i]-1];
					}catch(Exception e) {
					}
				}else {
					//System.out.print(count[i] + " ");
					try{
						sum += choice2[count[i]];
					}catch(Exception e) {
					}
				}
			}
			System.out.println(sum);
		}




	}
}

class combination{


	static final int MOD = 1000000007;

	//階乗時の各値をMODの元で計算しておく
	static long[] factorial = new long[10000000];
	static void intFactorial() {
		factorial[0] = 1;
		for(int i = 1; i < 10000000; i++) {
			factorial[i] = factorial[i-1] * i % MOD;
		}

	}

	//フェルマーの小定理を利用して,pを法としてのaの逆元a^p-2を求める
	public static long MODinv(long a ,long p) {
		return modpow(a ,p-2 ,p);
	}

	//a^n (mod p)を二分累乗法で計算する
	public static long modpow(long a, long n, long p) {
		long ans = 1;
		while(n > 0) {
			if(n%2 == 1) {
				ans = ans * a % p;
			}
			n = n / 2;
			a = a * a % p;
		}
		return ans;
	}

	//nCrをMODを法として計算する
	static long comb(int n, int r) {
		if(n==0 && r==0) return 1;
		if(n<r || n<0) return 0;

		return (factorial[n] * MODinv(factorial[r], MOD)) % MOD * MODinv(factorial[n-r], MOD) % MOD;
	}








}

