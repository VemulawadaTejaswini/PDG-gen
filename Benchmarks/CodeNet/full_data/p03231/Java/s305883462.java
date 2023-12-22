import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    String S = sc.next();
    String T = sc.next();
    int g = gcd(N,M);
    boolean is_ok = true;

    if(g==1){
      long L = N*M;
      System.out.println(L);
    }else{
      int n = N/g;
      int m = M/g;
      long L = n*M;

      for(int l=0;l<g;l++){
        if(S.charAt(l*n)!=T.charAt(l*m)){
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

  }

  private static int gcd(int m, int n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
  }

}
