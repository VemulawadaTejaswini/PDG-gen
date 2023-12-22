import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String str = r.readLine();
    String[] sl = str.split("[\\s]+");
    int pn = Integer.parseInt(sl[0]);
    int cn = Integer.parseInt(sl[1]);
    int[] st = new int[100001];
    int[] tt = new int[100001];
    int[] ch = new int[100001];

    Map<Integer, ArrayList<Integer>> m = new HashMap<Integer, ArrayList<Integer>>();

    int[] rec = new int[100001];
    int urecn = 0;
    ArrayList<Integer> free = new ArrayList<Integer>();

    for (int i = 0; i < pn; i++)
    {
      String[] ls = r.readLine().split("[\\s]+");
      st[i] = Integer.parseInt(ls[0]);
      tt[i] = Integer.parseInt(ls[1]);
      ch[i] = Integer.parseInt(ls[2]);
      if(m.get(st[i]) == null)
      {
        ArrayList<Integer> h = new ArrayList<Integer>();
        h.add(i);
        m.put(st[i], h);
      }
      else
      {
        m.get(st[i]).add(i);
      }
    }

    for(int t = 1; t <= 100000; t++)
    {
      for(int v = 0; v < urecn; v++)
      {
        if(rec[v] != -1 && t == tt[rec[v]])
        {
          rec[v] = -1;
          free.add(v);
        }
      }

      ArrayList<Integer> newps = m.get(t);

      if(newps != null)
      {

        for(Integer p : newps)
        {

          if(free.isEmpty())
          {
            rec[urecn] = p;
            urecn++;
          }
          else
          {
            int k = free.remove(0);
            rec[k] = p;
          }
        }
      }
    }

    System.out.println(urecn);
  }
}