import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();

     for(int i=1;i<10;i++){
       for(int j=1;j<10;j++){
        if(N==i*j){
          System.out.println("Yes");
          return;
        }
       }
     }
      System.out.println("No");
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