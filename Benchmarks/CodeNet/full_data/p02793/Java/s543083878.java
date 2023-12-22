
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		PrimeNumberGenerator pg = new PrimeNumberGenerator();
		int a[] = new int[n];

		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
		}
		int mod = 1_000_000_007;
//		int currentGCD = a[0];
//		int currentLCM = a[0];
//		for(int i = 1; i < n; i++){
////			currentGCD = gcd(a[i], currentGCD);
//			currentLCM = (int)lcmMod(currentLCM, a[i], mod);
//
//			System.out.println("gcd "+currentGCD+" lcm "+currentLCM);
//		}
		int factor[] = new int[1000000];
		for(int i = 0; i < n; i++){
			int num = a[i];

			int div = 2;
			while(num > 1){
				if(pg.isPrime(num)){
					factor[num] = Math.max(factor[num], 1);
					break;
				}

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

	static long lcmMod(int a, int b, int gcd, int mod){
    	return (long)a*((long)b*repeatablePow(gcd, mod - 2, mod)%mod)%mod;
    }

    static long lcmMod(int a, int b, int mod){
    	int g = gcd(a, b);

    	return lcmMod(a,b,g,mod);
    }

	static int gcd(int a, int b){
        int tmp;

        while (a % b != 0)
        {
            tmp = b;
            b = a % b;
            a = tmp;
        }
        return b;
    }
}

class PrimeNumberGenerator {
    private boolean[] isPrime= new boolean[1000001];

    public PrimeNumberGenerator() {
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;
        isPrime[2] = true;

        int limit = (int)Math.sqrt(isPrime.length);
        for(int i = 3; i <= limit; i+=2){
            if(isPrime[i] == false){
                continue;
            }

            for(int j = i * 2; j <= isPrime.length - 1; j += i){
                isPrime[j] = false;
            }
        }
    }

    public boolean isPrime(int index){
        if(index % 2 == 0 && index != 2){
            return false;
        }
        return isPrime[index];
    }
}
