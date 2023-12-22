import java.util.*;
public class Main2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    long[] T  = new long[num];
    for(int i = 0; i<num; i++) {
      T[i] = sc.nextLong();
    }
    if(num == 1) {
      System.out.println(T[0]);
      return;
    }
    for(int i = 0; i<num-1; i++){
      long m = T[i];
      long n = T[i+1];
      T[i+1] = lcm(m, n);
    }
    System.out.println(T[num-1]);
  }

  private static long gcd(long m, long n) {
       if(m < n) return gcd(n, m);
       if(n == 0) return m;
       return gcd(n, m % n);
   }

   private static long lcm(long m, long n) {
       return m * n / gcd(m, n);
   }
}
