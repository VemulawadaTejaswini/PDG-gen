import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long time = sc.nextLong();
    LinkedList<long[]> a = new LinkedList<>();
    LinkedList<long[]> b = new LinkedList<>();
    for(int i = 0; i < n; ++i) {
      long[] cur = new long[2];
      cur[0] = sc.nextInt();
      cur[1] = sc.nextInt();
      if(cur[0] == 0) {
        b.add(cur);
      } else {
        a.add(cur);
      }
    }
    Collections.sort(a, new Comparator<long[]>(){
      public int compare(long[] a, long[] b) {
        long first = a[1] / a[0];
        long second = b[1] / b[0];
        if(first > second) return 1;
        if(first < second) return -1;
        return (int)(a[1] - b[1]);
      }
    });
    Collections.sort(b, (x, y) -> ((int) (x[1] - y[1])));
    long cost = 0;
    int count = 0;
    for(int i = 0; i < n; ++i) {
      cost += check(cost, a, b);
      if(time >= cost + i + 1) ++count;
      else break;
    }
    System.out.println(count);
  }
  
  private static long check(long now, LinkedList<long[]> a, LinkedList<long[]> b) {
    if(a.isEmpty()) return b.get(0)[1];
    long[] cur = a.get(0);
    if(b.isEmpty()) return now * cur[0] + cur[1];
    if(now * cur[0] + cur[1] <= b.get(0)[1]) {
      a.poll();
      return now * cur[0] + cur[1];    
    } else {
      return b.poll()[1];
    }
  }
}
