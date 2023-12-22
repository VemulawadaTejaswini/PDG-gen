import java.util.*;

class Main {
  public static final long MOD = 1000000007;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    String S = sc.next();
    char SSS[] = S.toCharArray();
    if(SSS[K-1] == 'A') SSS[K-1] = 'a';
    else if(SSS[K-1] == 'B') SSS[K-1] = 'b';
    else SSS[K-1] = 'c';
    for(int i=0; i<N; i++) System.out.print(SSS[i]);
    
  }

  public static int gcd(int a, int b){
    if(b == 0) return a;
    return gcd(b, a%b);
  }
}