import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int X = sc.nextInt();
      int max = X/100;
      int min = X/105;
      int amari = X%100;
      
	  for(int i=min;i<=max;i++){
        if(amari<=i*5){
          System.out.println("1");
          return;
        }
        amari=amari+100;
      }
      System.out.println("0");
      

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
