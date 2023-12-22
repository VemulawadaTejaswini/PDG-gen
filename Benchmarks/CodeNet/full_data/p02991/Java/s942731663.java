import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;

public class Main
{
  static ArrayList<ArrayList<Integer>> g = new ArrayList<>();
  static ArrayList<ArrayList<Integer>> g3 = new ArrayList<>();
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");
    int n = Integer.parseInt(sl[0]);
    int m = Integer.parseInt(sl[1]);

    for(int i = 0; i < n; i++)
    {
      g.add(new ArrayList<>());
      g3.add(new ArrayList<>());
    }

    for(int i = 0; i < m; i++)
    {
      s = r.readLine();
      sl = s.split(" ");
      int u = Integer.parseInt(sl[0]) - 1;
      int v = Integer.parseInt(sl[1]) - 1;
      g.get(u).add(v);
    }

    s = r.readLine();
    sl = s.split(" ");
    int src = Integer.parseInt(sl[0]) - 1;
    int dst = Integer.parseInt(sl[1]) - 1;

    for(int i = 0; i < n; i++)
    {
      make_tri(i, i, 0);
    }
    
    System.out.println(diff_tri(src, dst, 0, n));
  }

  public static void make_tri(int src, int cur, int diff)
  {
    if(diff == 3)
    {
      g3.get(src).add(cur);
      return;
    }
    for(int e: g.get(cur))
    {
      make_tri(src, e, diff + 1);
    }
  }

  public static int diff_tri(int cur, int dst, int diff, int n)
  {

    class A
    {
      public int cur;
      public int dst;
      public int diff;

      public A(int c, int d, int di)
      {
        cur = c;
        dst = d;
        diff = di;
      }
    }
    
    HashSet<Integer> h = new HashSet<>();
    for(int i = 0; i < n; i++)
    {
      h.add(i);
    }

    Deque<A> q = new ArrayDeque<>();
    q.offer(new A(cur, dst, diff));
    while(!q.isEmpty())
    {
      A a = q.poll();
      if(a.cur == a.dst)
      {
        return a.diff;
      }
      for(int e: g3.get(a.cur))
      {
        if(h.contains(e)) q.offer(new A(e, a.dst, a.diff + 1));
        h.remove(e);
      }
    }

    return -1;
  }

}