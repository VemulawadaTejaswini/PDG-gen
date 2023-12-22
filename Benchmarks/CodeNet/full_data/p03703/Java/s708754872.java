import java.util.*;

public class Main {
  static int N;
  static int[] bit;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    int K = sc.nextInt();
    long s = 0;
    long[] sList = new long[N];
    ArrayList<Long> list = new ArrayList<Long>();
    list.add(s);
    for(int i = 0; i < N; i++) {
      long a = sc.nextLong();
      a -= K;
      s += a;
      sList[i] = s;
      if(!(list.contains(s))) list.add(s);
    }
    Collections.sort(list);
    HashMap<Long, Integer> map = new HashMap<Long, Integer>();
    int index = 1;
    for(int i = 0; i < list.size(); i++) {
      map.put(list.get(i), index);
      index++;
    }
    bit = new int[N + 2];
    add(map.get((long)0), 1);
    long ans = 0;
    for(int i = 0; i < N; i++) {
      int l = map.get(sList[i]);
 //     ans += sum(l);
//      add(l, 1);
    }
    System.out.println(ans);
  }

  static void add(int a, int w) {
    for(int x = a; x <= N + 1; x += x & -x) bit[x] += w;
  }

  static int sum(int a) {
    int ret = 0;
    for(int x = a; x > 0; x -= x & -x) ret += bit[x];
    return ret;
  }
}
