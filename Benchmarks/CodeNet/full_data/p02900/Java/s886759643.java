import java.util.*;
public class Main {
  	static int mod = 1000000007;
  static int size = 200001;
	static long[] fac = new long[size];
	static long[] finv = new long[size];
	static long[] inv = new long[size];
	static int INF = Integer.MAX_VALUE;
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	// 整数の入力
	long A = sc.nextLong();
  long B =sc.nextLong();
  List<Long> sosus = new ArrayList<Long>();
  sosus.add(2L);
  sosus.add(3L);
  sosus.add(5L);
  for(long i=7;i<=A||i<=B;i++){
    if(sosuu(i)){
       sosus.add(i);
    }
  }

  
long count = 1;
        for(long sosu:sosus){
          if(A%sosu==0&&B%sosu==0){
           count++; 
          }
        }
    System.out.print(count);
} 

   //素数判定的なあれ
	public static  boolean sosuu(Long lon){
      if(lon%2==0){
        return false;
      }
      if(lon%3==0){
        return false;
      }
		for (long i = 4; i < lon/2; ++i) {
			if(lon%i==0){
             return false;
            }
		}
      return true;
	}
  
 //fac, inv, finvテーブルの初期化、これ使う場合はinitComb()で初期化必要
	public static  void initComb(){
		fac[0] = finv[0] = inv[0] = fac[1] = finv[1] = inv[1] = 1;
		for (int i = 2; i < size; ++i) {
			fac[i] = fac[i - 1] * i % mod;
			inv[i] = mod - (mod / i) * inv[(int) (mod % i)] % mod;
			finv[i] = finv[i - 1] * inv[i] % mod;
		}
	}
 
	//nCk % mod
	public static long comb(int n, int k){
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
		return fac[n] * finv[k] % mod * finv[n - k] % mod;
	}
 
	//n! % mod
	public static long fact(int n){
		return fac[n];
	}
 
	//(n!)^-1 with % mod
	public static long finv(int n){
		return finv[n];
	}
  
}