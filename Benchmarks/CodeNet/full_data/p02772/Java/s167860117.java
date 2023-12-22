import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int N = sc.nextInt();
      int[] A = new int[N];
      for(int i=0;i<N;i++){
        A[i] = sc.nextInt();
        if(A[i]%2==0&&A[i]%3!=0&&A[i]%5!=0){
          System.out.println("DENIED");
          return;
        }
      }
      
      System.out.println("APPROVED");
      

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
