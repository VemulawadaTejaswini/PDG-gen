import java.util.Scanner;

public class Main {
	public static final long mod = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if((2*y-x)%3 == 0 && (2*x-y)%3 == 0) {
			long X = (2*x-y)/3;
			long Y = (2*y-x)/3;
			long ans = 1;
			if(X >= Y) {
				long XY = X+Y;
				while(XY > Y) {
					ans = ans*XY%mod;
					XY -= 1;
				}
				ans = ans*pow(kaijo(X), mod-2)%mod;
			}else{
				long XY = X+Y;
				while(XY > X) {
					ans = ans*XY%mod;
					XY -= 1;
				}
				ans = ans*pow(kaijo(Y), mod-2)%mod;
			}
			System.out.println(ans);
		}else {
			System.out.println(0);
		}
		sc.close();
	}

	private static long kaijo(long n) {
	    long a = 1;
		while(n != 0) {
			a = a*n%mod;
			n = n-1;
		}
		return a;
	}

	public static final long pow(long x, long n) {
	    long sum = 1;
	    while (n > 0) {
	        if ((n & 1) == 1) {
	            sum = sum * x % mod;
	        }
	        x = x*x%mod;
	        n >>= 1;
	    }
	    return sum;
	}
}