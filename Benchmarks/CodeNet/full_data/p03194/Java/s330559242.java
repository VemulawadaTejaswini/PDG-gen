import java.util.Scanner;

public class Main {
	static boolean[] isPrime;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long P = sc.nextLong();
		sc.close();
		if(N == 1) {
			System.out.println(P);
			System.exit(0);
		}
		long ans = 1;
		long t = (long)Math.pow(P, (double)1 / N);

		for(long k = 2; k <= t; k++) {
			long s = (long)Math.pow(k, N);
			if(P % s == 0) {
				ans = k;
			}
		}
		System.out.println(ans);
	}
	static void aryPrime(){
        int l = isPrime.length;
        for(int i = 0; i < l; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2; i <= (int)Math.sqrt(l); i++) {
            if(isPrime[i]) {
                for(int j = i * 2; j < l; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
}