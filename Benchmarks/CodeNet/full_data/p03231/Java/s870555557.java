import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      int m=sc.nextInt();
      if(n%m==0||m%n==0){
      System.out.println(-1);
      }
      else{
      System.out.println(lcm(m, n));
      }
        
    }
   static int gcd(int m, int n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }
    
    static int lcm(int m, int n) {
        return m * n / gcd(m, n);
    }
}