import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] h = new long[n];
    for(int i = 0; i < n; i++) {
      h[i] = sc.nextLong();
    }
    System.out.println(func(h));
  }

  public static long func(long[] h) {
    long m = Long.MAX_VALUE;
    for(int i = 0; i < h.length; i++) {
      if(m > h[i]) m = h[i];
    }
    ArrayList<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < h.length; i++) {
      if(h[i] == m) list.add(i);
    }
    long ret = m;
    for(int i = 0; i < list.size(); i++) {
      int t1 = list.get(i) + 1;
      int t2 = 0;
      if(i < list.size() - 1) {
        t2 = list.get(i + 1) - 1;
      } else {
        t2 = h.length - 1;
      }
      if(t2 >= t1) {
        long[] s = new long[t2 - t1 + 1];
        for(int j = 0; j < (t2 - t1 + 1); j++) {
          s[j] = h[t1 + j];
        }
        ret += func(s);
      }
    }
    return ret;
  }
}