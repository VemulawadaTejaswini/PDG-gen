import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int N = sc.nextInt();
      int P = sc.nextInt();
      String S = sc.next();
      Long count=0L;
      for(int i=0;i<N;i++){
       for(int j=i+1;j<N+1;j++){
         if(Integer.parseInt(S.substring(i,j))%P==0){
           count++;
         }
       }
      }

      System.out.println(count);


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
