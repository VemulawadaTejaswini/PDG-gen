import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    long x[] = new long[n];
    long d[] = new long[n-1];
    long mod = 1000000007;
    long ans = 0;
    
    if(n>2000) return;
    
    x[0] = Long.parseLong(sc.next());
    for (int i=1; i<n; i++){
      x[i] = Long.parseLong(sc.next());
    }
    for (int i=0; i<n-1; i++){
      d[i] = x[n-1] - x[i];
    }
    
    long sub = 0;
    for(int i=1; i<n; i++){
      sub = d[i-1];
      for(long j=1; j<n; j++){ // fact[n-1] / i
        if(j==i) continue;
        sub *= j;
        sub %= mod;
      }
      ans += sub;
      sub %= mod;
    }
    
    System.out.println(ans%mod);
    
  }
  
}
