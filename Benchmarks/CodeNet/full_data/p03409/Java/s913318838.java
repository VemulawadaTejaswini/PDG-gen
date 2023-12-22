import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    int n = Integer.parseInt(r.readLine());
    int[] a = new int[200];
    int[] b = new int[200];

    HashMap<Integer, ArrayList<Integer>> g = new HashMap<>();

    for(int i = 0; i < n; i++)
    {
      String[] ls = r.readLine().split("[\\s]+");
      a[i] = Integer.parseInt(ls[0]);
      b[i] = Integer.parseInt(ls[1]);
    }

    for(int i = n; i < 2 * n; i++)
    {
      String[] ls = r.readLine().split("[\\s]+");
      a[i] = Integer.parseInt(ls[0]);
      b[i] = Integer.parseInt(ls[1]);
    }

    for(int i = 0; i < 2 * n; i++)
    {
      g.put(i, new ArrayList<Integer>());
    }
    ArrayList<Integer> t = new ArrayList<>();
    for(int i = 0; i < n; i++)
    {
      t.add(i);
    }
    g.put(1000, t);
    for(int i = n; i < 2 * n; i++)
    {
      g.get(i).add(2000);
    }
    g.put(2000, new ArrayList<>());

    for(int i = 0; i < n; i++)
    {
      for(int j = n; j < 2 * n; j++)
      {
        if(a[i] < a[j] && b[i] < b[j])
        {
          g.get(i).add(j);
        }
      }
    }

    //System.out.println(g);
    //System.out.println(path(g, 1000, new HashSet<>()));

    int z = 0;
    for(z = 0; ; z++)
    {
      ArrayList<Integer> p = path(g, 1000, new HashSet<>());
      if(p == null)
      {
        break;
      }
      ArrayList<Integer> w = new ArrayList<>(p);
      w.add(0, 1000);
      int ws = w.size();
      for(int i = 0; i < ws - 1; i++)
      {
        re(g, w.get(i), w.get(i + 1));
      }
    }

    System.out.println(z);
  }

  public static ArrayList<Integer> path(HashMap<Integer, ArrayList<Integer>> g, Integer v, HashSet<Integer> h)
  {
    //System.out.println(v);
    if(v == 2000)
    {
      return new ArrayList<>();
    }
    ArrayList<Integer> z = g.get(v);
    for(Integer c : z)
    {
      if(!h.contains(c))
      {
        h.add(c);
        ArrayList<Integer> a = path(g, c, h);
        if(a != null)
        {
          a.add(0, c);
          return a;
        }
        h.remove(c);
      }
    }
    return null;
  }

  public static void re(HashMap<Integer, ArrayList<Integer>> g, Integer a, Integer b)
  {
    ArrayList<Integer> z1 = g.get(a);
    ArrayList<Integer> z2 = g.get(b);
    z1.remove(b);
    z2.add(a);
  }

}