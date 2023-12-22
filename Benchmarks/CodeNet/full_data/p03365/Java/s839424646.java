
import java.util.Scanner;

class Solver{
	Scanner sc =new Scanner(System.in);
	
	int mod = 1000000007;
	
	int perm[] = new int[1123456];
	{
		perm[0] = 1;
		for(int i = 1; i <= 1123450;i++){
			perm[i] = (int)(((long)perm[i-1]*i) % mod);
		}
	}
	
	void run(){
		int n = sc.nextInt()-1;
		
		
		long res = perm[n] * (n);
		for(int i = 1 ; i<=(n-1)/2;i++){
			res = (res + mod - ((long)comb2(n ,i)*perm[n-i])%mod)%mod;
		}
		
		System.out.println(res);
	}
	
	
	long comb2(int x,int y){
		int s = x - 2 - y;
		return comb_mod(s+1,  y);
	}

	
	int exp_mod(long a, long b, int m) {
		long res = 1;
		while (b > 0) {
			if ((b&1) == 1)
				res = (res * a)%m;
			a = (a * a)%m;
			b >>= 1;
		}
		return (int)res;
	}

	int comb_mod(int n, int r) {
		return (int) 
				( (long) ( (long)perm[n] * exp_mod(perm[r],  mod-2,mod) % mod)
				                         * exp_mod(perm[n-r],mod-2,mod) % mod);
	}
}

public class Main {
	public static void main(String[] args){
		Solver s  = new Solver();
		s.run();
	}
}

