import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
      int N = sc.nextInt();
	  int[] a = new int[N];
      int[] b = new int[N];
      int color = 2;
      int now = 2;
      	a[0] = sc.nextInt();
        b[0] = sc.nextInt();
      for(int i=1;i<N-1;i++){
        a[i] = sc.nextInt();
        b[i] = sc.nextInt();
        if(a[i-1]==a[i]){
          now++;
        }else{
          if(now>color){
            color=now;
          }
          now=2;
        }
      }
      now--;
      if(now>color){
        color=now;
      }

      System.out.println(color);
      now=0;
      System.out.println("1");
	  for(int j=1;j<N-1;j++){
      	if(a[j-1]==a[j]){
          now++;
          System.out.println(now%color+1);
        }else{
          now++;
          if(a[j]!=b[j-1]){
            now=now-1;
          }
          System.out.println(now%color+1);
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