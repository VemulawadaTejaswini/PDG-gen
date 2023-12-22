import java.util.Scanner;

public class Main {
  
  static final int a = 1000000007;
  
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    int M = Integer.parseInt(sc.next());
    long[] Ncount = new long[N+1];
    long[] Mcount = new long[M+1];
    Ncount[0] = Mcount[0] = 1;
    for (int i =1; i<=N; i++) {
      Ncount[i] = Ncount[i-1] * i;
      Ncount[i] %= a;
    }
    for (int i =1; i<=M; i++) {
      Mcount[i] = Mcount[i-1] * i;
      Mcount[i] %= a;
    } 
    long ans = Ncount[N] * Mcount[M];
    if (N == M) ans *= 2;
    if (Math.abs(N - M) >= 2) ans =0;
    System.out.println(ans % a);
  }
}