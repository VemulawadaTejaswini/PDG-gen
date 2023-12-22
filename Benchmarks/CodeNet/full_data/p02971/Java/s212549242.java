import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      int[] A = new int[N];
      int i=0;
      int max=1;
      int mmax=0;
      for(i=0;i<N;i++){
        A[i] = sc.nextInt();
        if(A[i]>=mmax){
          mmax=A[i];
          if(A[i]>=max){
            mmax=max;
            max=A[i];
          }
        }
      }
      for(i=0;i<N;i++){
        if(A[i]==max){
          System.out.println(mmax);    
        }else{
          System.out.println(max);    
        }
      }
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