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
	int N = sc.nextInt();
  int[] B = new int[N-1];
  int[] A = new int[N];
  int i=0;
  int sum=0;
  for(i=0;i<N-1;i++){
    B[i]=sc.nextInt();
  }
  A[0]=B[0];
  for(i=1;i<N-1;i++){
    if(B[i]>B[i-1]){
    	A[i]=B[i-1];
    }else{
    	A[i]=B[i];   
    }
  }
  A[N-1]=B[N-2];
  for(i=0;i<N;i++){
    sum=sum+A[i];
  }

    System.out.println(sum);



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