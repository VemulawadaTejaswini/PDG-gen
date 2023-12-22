import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    int temp = m;
    final long mod = 1_000_000_007;
    int count;
    long ans = 1;
    for(int i = 2; i <= Math.sqrt(m); i++) {
      count = 0;
      while(temp % 2 == 0) {
        count++;
        temp /= 2;
      }
      ans = (ans * nCk(count + n - 1, count, mod)) % mod;
    }
    if(temp != 1) ans = (ans * nCk(n, 1, mod)) % mod;
    System.out.println(ans);
  }

  public static long nCk(int n, int k, long p) {
  long factorial = 1;
  k = Math.min(k, n - k);
  //k!(mod p)の逆元をmodPowを用いて計算
  for(int i = 2; i <= k; i++) {
    factorial = (factorial * i) % p;
  }
  factorial = modPow(factorial, p-2, p);
  //n(n-1)...(n-k+1) (mod p)の計算
  for(int i = n - k + 1; i <= n; i++) {
    factorial = (factorial * i) % p;
  }
  return factorial;
}

public static long modPow(long a, long b, long p) {
  long power = 1;
  while(b > 0) {
    if((1 & b) == 1) power = (power * a) % p;
    a = (a * a) % p;
    b = b >> 1;
  }
  return power;
}
}
