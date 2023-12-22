import java.util.*;

public class Main {
  static int N;
  static int[] dat;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    init(n);
    for(int i = 0; i < n; i++) {
      int a = sc.nextInt();
      update(i, a);
    }

    int ans = 1;

    for(int i = 0; i < n; i++) {
      if(i < n - 1) {
        ans = Math.max(ans, gcd(query(0, i, 0, 0, N), query(i + 1, n, 0, 0, N)));
      } else {
        ans = Math.max(ans, query(0, i, 0, 0, N));
      }
    }

    System.out.println(ans);
  }

  public static void init(int n_) {
    int n = 1;
    while(n < n_) {
      n *= 2;
    }
    N = n;
    dat = new int[2 * N - 1];
  }

  public static void update(int k, int x) {
    int a = k + N - 1;
    dat[a] = x;
    while(a > 0) {
      a = (a - 1) / 2;
      dat[a] = gcd(dat[2 * a + 1], dat[2 * a + 2]); 
    }
  }

  public static int query(int a, int b, int k, int l, int r) {
    if((r <= a) || (l >= b)) return 0;
    if((a <= l) && (r <= b)) {
      return dat[k];
    } else {
      int vl = query(a, b, 2 * k + 1, l, (l + r) / 2);
      int vr = query(a, b, 2 * k + 2, (l + r) / 2, r);
      return gcd(vl, vr);
    }
  }

  public static int gcd(int a, int b) {
    if(b == 0) return a;
    return gcd(b, a % b);
  }
}