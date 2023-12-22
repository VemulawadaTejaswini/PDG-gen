import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      long H = sc.nextLong();
      long W = sc.nextLong();

      if(W==1||H==1){
        System.out.println("1");
        return;
      }
      if(W%2==0||H%2==0){
        System.out.println(W*H/2);
        return;
      }
      System.out.println(W*H/2+1);

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
