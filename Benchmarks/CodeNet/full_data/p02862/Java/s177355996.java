import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long X = sc.nextLong();
		long Y = sc.nextLong();

        long prime = 1000000007;
        
		if((X + Y) % 3 != 0){
			System.out.println(0);
		}
		else{
			long n = (X + Y) / 3;
			if(Math.abs(X - Y) > n)
				System.out.println(0);
			else{
				long e = X - n;
				long n1 = 1;
				long e1 = 1;
				for(int i = 0; i < e; i++){
					n1 = (n1 * (n - i)) % prime;
					e1 = (e1 * (e - i)) % prime;
				}
				long nCe = (n1 * modPow(e1, prime - 2, prime))%prime;

				System.out.println((nCe >= 0)?nCe:nCe+prime);
			}
		}
	}
	
    private static long modPow(long a, long n, long p){
    	long ans = 1;
    	while (n > 0){
    		if((n & 1) == 1){
    			ans = (ans * a) % p;
    		}
			a = (a * a) % p;
			n >>= 1;
    	}
    	return(ans);
    }
}