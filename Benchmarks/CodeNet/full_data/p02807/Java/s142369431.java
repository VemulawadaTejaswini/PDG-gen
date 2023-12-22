import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    long x[] = new long[n];
    long d[] = new long[n-1];
    long fact[] = new long[n];
    long fact2[] = new long[n];
        
    long mod = 1000000007;
    long ans = 0;
    
    x[0] = Long.parseLong(sc.next());
    fact[0] = 1;
    for (int i=1; i<n; i++){
      x[i] = Long.parseLong(sc.next());
      fact[i] = fact[i-1] * i % mod;
    }
    for (int i=0; i<n-1; i++){
      d[i] = x[n-1] - x[i];
    }
    
    long sub = 0;
    for(int i=1; i<n; i++){
      sub = d[i-1];
      for(int j=1; j<n; j++){ // fact[n-1] / i
        if(j==i) continue;
        sub *= j % mod;
      }
      ans += sub % mod;
    }
    
    System.out.println(ans);
    
  }
  
  public long modinv(long a, long m) {
      long tmp = 0;
      long b = m, u = 1, v = 0;
      for (long i=1; i<=b; i++) {
          long t = a / b;
          a -= t * b;
          if (a < b) {
            tmp = a;
            a = b;
            b = tmp;
          }
          u -= t * v;
          if (u < v) {
            tmp = u;
            u = v;
            v = tmp;
          }
      }
      u %= m;
      if (u < 0) u += m;
      return u;
  }
}
