
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class Main
{

  static Integer[] x = new Integer[114514];
  static int v = 1;
  static boolean z = false;
  static int next = 1;

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    String[] sl = s.split("[\\s]+");

    int n = Integer.parseInt(sl[0]);
    int m = Integer.parseInt(sl[1]);

    HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<Integer, HashMap<Integer, Integer>>();

    for(int i = 0; i <= n; i++)
    {
      map.put(i, new HashMap<Integer, Integer>());
    }

    for(int i = 0; i < m; i++)
    {
      s = r.readLine();
      sl = s.split("[\\s]+");
      int left = Integer.parseInt(sl[0]);
      int right = Integer.parseInt(sl[1]);
      int dist = Integer.parseInt(sl[2]);

      HashMap<Integer, Integer> h = map.get(left);
      h.put(right, dist);
      h = map.get(right);
      h.put(left, - dist);
    }

    for(int i = 1; i <= n; i++)
    {
      x[i] = null;
    }
    x[1] = 0;

    while(v < n)
    {
      z = false;

      sub(map, next);

      if(!z)
      {
        for(int i = 1; i <= n; i++)
        {
          if(x[i] == null)
          {
            x[i] = 0;
            v++;
            next = i;
            break;
          }
        }
      }
    }


    for(int i = 1; i <= n; i++)
    {
      HashMap<Integer, Integer> h = map.get(i);
      for(Entry<Integer, Integer> e : h.entrySet())
      {
        if(x[e.getKey()] != x[i] + e.getValue())
        {
          System.out.println("No");
          System.exit(0);
        }
      }
    }

    System.out.println("Yes");

  }

  public static void sub(HashMap<Integer, HashMap<Integer, Integer>> map, int i)
  {
    HashMap<Integer, Integer> h = map.get(i);
    HashSet<Integer> a = new HashSet<Integer>();
    for(Entry<Integer, Integer> e : h.entrySet())
    {
      if(x[e.getKey()] == null)
      {
        x[e.getKey()] = x[i] + e.getValue();
        next = i;
        a.add(e.getKey());
        v++;
        z = true;
      }
      else
      {
        if(x[e.getKey()] != x[i] + e.getValue())
        {
          System.out.println("No");
          System.exit(0);
        }
      }
    }

    for(Integer n : a)
    {
      sub(map, n);
    }
  }
}
