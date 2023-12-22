import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static int X = scan.nextInt();
	static int Y = scan.nextInt();
	
	//static long memo[][] = new long[Y+1][X+1];
	//static boolean check[][] = new boolean[Y+1][X+1];
	public static void main(String[]args) {
		COMinit();
		
		long goukei = 0;
		
		if((X+Y)%3!=0) {
			System.out.println(0);
		}else {
			int z = (X+Y)/3;
			for(int i = 0;i<=z;i++) {
				int s = 2*(z-i)+i;
				int t = z-i+2*i ;
				if(s==X&&t==Y) {
					goukei = (goukei+COM(z,i))%MOD;
				}
			}
			
			
			System.out.println(goukei);
			
		}
			
			
			
		
	}
	
	
		//拡張ユークリッドでの逆元の求め方でnCkをつくる、前処理必須。
	
	static  int MAX = 1000003;
	static  int MOD = 1000000007;

	 static long[] fac = new long[MAX]; 
	 static long[] finv = new long[MAX]; 
	 static long[] inv = new long[MAX]; 

	// テーブルを作る前処理
	static void COMinit() {
	    fac[0] = fac[1] = 1;
	    finv[0] = finv[1] = 1;
	    inv[1] = 1;
	    for (int i = 2; i < MAX; i++){
	        fac[i] = fac[i - 1] * i % MOD;
	        inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
	        finv[i] = finv[i - 1] * inv[i] % MOD;
	    }
	}

	// 二項係数計算
	static long COM(int n, int k){
	    if (n < k) return 0;
	    if (n < 0 || k < 0) return 0;
	    return fac[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}
		
		
	}
		


