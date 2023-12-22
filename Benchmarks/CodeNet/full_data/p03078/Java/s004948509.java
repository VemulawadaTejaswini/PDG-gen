import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    int x = 0;
    int y = 0;
    int z = 0;
    int k = 0;
    long[] a = new long[0];
    long[] b = new long[0];
    long[] c = new long[0];
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      String[] s = br.readLine().split("\\s+");
      x = Integer.parseInt(s[0]);
      y = Integer.parseInt(s[1]);
      z = Integer.parseInt(s[2]);
      k = Integer.parseInt(s[3]);
      a = Arrays.stream(br.readLine().split("\\s+"))
        .mapToLong(Long::parseLong)
        .map(i -> -i).sorted().map(i -> -i).toArray();
      b = Arrays.stream(br.readLine().split("\\s+"))
        .mapToLong(Long::parseLong)
        .map(i -> -i).sorted().map(i -> -i).toArray();
      c = Arrays.stream(br.readLine().split("\\s+"))
        .mapToLong(Long::parseLong)
        .map(i -> -i).sorted().map(i -> -i).toArray();
    } catch (IOException e) {
      e.printStackTrace();
    }
    PriorityQueue<Longs> pq = new PriorityQueue<>();
    Set<Longs> set = new HashSet<>();
    Longs n = new Longs(a[0]+b[0]+c[0],0,0,0);
    Longs m;
    pq.add(n);
    set.add(n);
    for (int i=0;i<k;i++) {
      n = pq.poll();
      System.out.println(n.n);
      int p = n.i;
      int q = n.j;
      int r = n.k;
      if (p+1 < x) {
        m = new Longs(a[p+1]+b[q]+c[r],p+1,q,r);
        if (!set.contains(m)) {
          pq.add(m);
          set.add(m);
        }
      }
      if (q+1 < y) {
        m = new Longs(a[p]+b[q+1]+c[r],p,q+1,r);
        if (!set.contains(m)) {
          pq.add(m);
          set.add(m);
        }
      }
      if (r+1 < z) {
        m = new Longs(a[p]+b[q]+c[r+1],p,q,r+1);
        if (!set.contains(m)) {
          pq.add(m);
          set.add(m);
        }
      }
    }
  }
  private class Longs implements Comparable<Longs> {
    private long n;
    private int i;
    private int j;
    private int k;
    private long priority;
    Longs(long n,int i,int j,int k) {
      this.n = n;
      this.i = i;
      this.j = j;
      this.k = k;
      priority = n;
    }
    @Override
    public int compareTo(Longs other) {
      return -Long.compare(priority,other.priority);
    }
    @Override
    public int hashCode() {
      int prime = 31;
      int result = 1;
      result = prime * result + (int)(n ^ (n >>> 32));
      result = prime * result + i;
      result = prime * result + j;
      result = prime * result + k;
      return result;
    }
    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null) return false;
      if (getClass() != obj.getClass()) return false;
      Longs other = (Longs)obj;
      return n == other.n && i == other.i && j == other.j && k == other.k;
    }
  }
}