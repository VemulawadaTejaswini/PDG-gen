import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int A = sc.nextInt();
      int B = sc.nextInt();
      int BiMin=(B*10);
      int BiMax =(B*10)+9;
      int i=-1;
	for(int j=BiMax;j>=BiMin;j--){
      if(j*8/100==A){
        i=j;
      }
    }

      System.out.println(i);


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
