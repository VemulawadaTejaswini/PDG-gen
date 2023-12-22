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
  int K = sc.nextInt();
    String S = sc.next();
  int Rcount=0;
  int Lcount=0;
  int RRcount=0;
  int LLcount=0;
    int RLcount=0;
  int i=0;
  int sum=0;
  String before = "N";
  int j=0;
  for(i=0;i<N;i++){
    if("R".equals(S.substring(i,i+1))){
      Rcount++;
      RRcount++;
      if(RRcount>1){
        sum++;
      }
      if(!"R".equals(before)&&!"N".equals(before)){
        LLcount=0;
        RLcount++;
      }
      before="R";
    }else{
      Lcount++;
      LLcount++;
      if(LLcount>1){
        sum++;
      }
      if(!"L".equals(before)&&!"N".equals(before)){
        RRcount=0;
        RLcount++;
      }
      before="L";
    }
  }
  if(RLcount-1<=K) {
    System.out.println(N-1);
  }else if(RLcount-2==K){
    System.out.println(sum+K*2-1);
  }
  else{
    System.out.println(sum+K*2);
  }




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