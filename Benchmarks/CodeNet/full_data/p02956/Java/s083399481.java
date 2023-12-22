import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static int mod = 998244353;
    public static  Map<Pair, Integer> num;
    public static int n;
    public static Pair[] p;
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        //

        n = Integer.parseInt(bf.readLine());
        p = new Pair[n];
        for(int i=0; i<n; i++) {
          StringTokenizer st = new StringTokenizer(bf.readLine());
          int x = Integer.parseInt(st.nextToken());
          int y = Integer.parseInt(st.nextToken());
          p[i] = new Pair(x, y);
        }
        Arrays.sort(p);
        num = new HashMap<Pair, Integer>();
        for(int i=0; i<n; i++) num.put(p[i], 0);
        Pair[] sortedX = getAns(0, n);
        //out.println(Arrays.toString(sortedX));
        //out.println(Arrays.toString(num));
        Map<Pair, Integer> m = new HashMap<Pair, Integer>();

        for(int i=0; i<n; i++) m.put(sortedX[i], i);
        long ans = 0;

        for(int i=0; i<n; i++) {
          int numAbove = n-i-1;
          int numRight = n-m.get(p[i])-1;
          int numAboveRight = num.get(p[i]);
          int numBottom = n-1-numAbove;
          int numLeft = n-1-numRight;
          int numAboveLeft = numAbove - numAboveRight;
          int numBottomRight = numRight-numAboveRight;
          int numBottomLeft = numBottom - numBottomRight;



          ans += 0L + exp2(n) - (0L + exp2(numAbove) + exp2(numBottom) + exp2(numLeft) + exp2(numRight)) + (0L + exp2(numAboveLeft) + exp2(numAboveRight) + exp2(numBottomLeft ) + exp2(numBottomRight));
          ans += 20L*mod;
          ans %= mod;
        }
        out.println(ans);
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
    public static int exp2(int e) {
      return (int)((0L + exp(2, e) - 1 + mod) % mod);
    }
    public static int exp(int base, int e) {
      if(e == 0) return 1;
      if(e == 1) return base;
      int val = exp(base, e/2);
      int ans = (int)(1L*val*val % mod);
      if(e % 2 == 1)
        ans = (int)(1L*ans*base % mod);
      return ans;
    }
    public static Pair[] getAns(int l, int r) {
      if(l==r) return new Pair[0];
      if(l+1 == r) {
        Pair[] pp = new Pair[1];
        pp[0] = p[l];
        return pp;
      }
      Pair[] x = getAns(l, (l+r)/2);
      Pair[] y = getAns((l+r)/2, r);
      Pair[] ppp = new Pair[r-l];
      int c0 = 0; int c1 = 0;
      for(int i=0; i<r-l; i++) {
        if((c1 >= y.length) || ((c0 < x.length) && (x[c0].a < y[c1].a))) {
          ppp[i] = x[c0];
          num.put(x[c0], num.get(x[c0])+ y.length-c1);
          //if(c0+l == 1) System.out.println(x[c0].toString() + " " + c1 + " " + Arrays.toString(y));
          c0++;
        }
        else {
          ppp[i] = y[c1];
          //num[c1+(l+r)/2] += x.length - c0;
          c1++;
        }
      }
      return ppp;
    }
}
class Pair implements Comparable<Pair> {
  public int a;
  public int b;
  public Pair(int a, int b) {
    this.a = a;
    this.b = b;
  }
  @Override
  public boolean equals(Object o) {
    Pair p = (Pair)o;
    return (this.compareTo(p) == 0);
  }

  //@Override
  //public int hashCode() {
  //  return (int)((1L*a*103948902382L+b) % 1000000007);
  //}

  @Override
  public int compareTo(Pair p) {
    if(this.b < p.b) return -1;
    if(this.b > p.b) return 1;
    if(this.a < p.a) return -1;
    if(this.a > p.a) return 1;
    return 0;
  }

  public String toString() {
    return this.a + " " + this.b;
  }
}
