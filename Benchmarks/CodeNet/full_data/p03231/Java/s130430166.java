import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long M = sc.nextLong();
    String S = sc.next();
    String T = sc.next();
    long g = gcd(N,M);
    boolean is_ok = true;
    long n = N/g;
    long m = M/g;
    long L = n*m*g;
    for(int l=0;l<g;l++){
      if(S.charAt((int)(l*n))!=T.charAt((int)(l*m))){
        is_ok = false;
        break;
      }
    }
    if(is_ok){
      System.out.println(L);
    }else{
      System.out.println(-1);
    }
  }

  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
  }

}
