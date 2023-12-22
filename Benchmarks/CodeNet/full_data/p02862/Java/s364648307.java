import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		int b = sc.nextInt();
		// 文字列の入力
		if((a + b) % 3 != 0){
			System.out.println(0);
		}else{
			int c = ((a + b) / 3 - (a - b)) / 2;
			int d = ((a + b) / 3 + (a - b)) / 2;
			int MAX = c + d + 1;
          long e;
int MOD = 1000000007;

long[] fac = new long[MAX];
long[] finv = new long[MAX];
long[] inv = new long[MAX];;


    fac[0] = fac[1] = 1;
    finv[0] = finv[1] = 1;
    inv[1] = 1;
    for (int i = 2; i < MAX; i++){
        fac[i] = fac[i - 1] * i % MOD;
        inv[i] = MOD - inv[MOD%i] * (MOD / i) % MOD;
        finv[i] = finv[i - 1] * inv[i] % MOD;
    }

// 二項係数計算
    e = fac[c + d] * (finv[c] * finv[d] % MOD) % MOD;


System.out.println(e);
		}
		
		
		
	}
}