import java.util.*;


import java.io.*;

class Main {
  private static long lcm(long m, long n) {
    return m * n / gcd(m, n);
  }

  private static long gcd(long m, long n) {
    if(m < n) return gcd(n, m);
    if(n == 0) return m;
    return gcd(n, m % n);
  }

  public static void main(String[] args) throws Exception{
    try (Scanner sc = new Scanner(System.in)){
      int N = sc.nextInt();
      int M = sc.nextInt();
      String S = sc.next();
      String T = sc.next();
      if (N < M) {
        int tmp = N;
        N = M;
        M = tmp;
        String t = S;
        S = T;
        T = t;
      }
      long lcm = lcm((long)N, (long)M);
      HashMap<Integer, Character> map = new HashMap<Integer, Character>();
      if (lcm == N) {
        int s = N / M;
        for (int i = 0; i < M; i++) {
          if (i * s < N && S.charAt(i * s) == T.charAt(i)) {
            System.out.println(-1);
            return;
          }
        }
      }
      int i = 1;
      long L = 0;
      out : while(L < Integer.MAX_VALUE) {
        map.clear();
        L = lcm * i;
        for (int j = 0; j < N; j++) {
          map.put((int)(j * L / N + 1), S.charAt(j));
        }
        for (int j = 0; j < M; j++) {
          if (map.containsKey((int)(j * L / M + 1))) {
            if (map.get((int)(j * L / M + 1)) != T.charAt(j)) {
              i++;
              continue out;
            }
          }
        }
        break;
      }
      System.out.println(L);
    }
  }
}
