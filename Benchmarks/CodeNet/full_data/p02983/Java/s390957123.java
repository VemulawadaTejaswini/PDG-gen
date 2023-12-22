import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long L = sc.nextLong();
      long R = sc.nextLong();
int mod = 2019;
      long minn =R;
      long min =L;
      long tmp =L;
      for(long i=L;i<R;i++){
        if(i%mod<minn&&min!=i%mod){
          minn = i%mod;
          if(minn<min){
            tmp = min;
            min = minn;
            minn = tmp;
          }
        }
      }


      System.out.println(min*minn);
    }
  
  private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
}
  
  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
}
}
