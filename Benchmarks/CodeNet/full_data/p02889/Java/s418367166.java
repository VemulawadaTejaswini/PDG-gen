import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 
import java.util.*;
import java.lang.*;
import java.io.*;

@SuppressWarnings("unchecked")
public class Main implements Runnable {

  static BufferedReader in;
  static PrintWriter out;

  static int n,m,l,qSize;
  static int[] from, to, parent, timesRefilled, fuelLeft, queue;
  static int[][] adj;
  static Map<Integer,Integer> costOfPath, totalRefills;
  static Map<Integer,Boolean> visited;

  public static int[][] generateAdjList(int n, int[] from, int[] to, int fromLen)
  {
    int[][] g = new int[n][];
    int[] p = new int[n];
    for (int f : from)
      p[f]++;
    for (int t : to)
      p[t]++;
    for (int i = 0; i < n; i++)
      g[i] = new int[p[i]];
    for (int i = 0; i < fromLen; i++)
    {
      g[from[i]][--p[from[i]]] = to[i];
      g[to[i]][--p[to[i]]] = from[i];
    }
    return g;
  }

  public static void bfs(int cur)
  {
    int i=0;

    qSize=0;
    queue[qSize++]=cur;
    parent[cur] = -1;

    while(i<qSize) {
      cur=queue[i++];
      for (int next : adj[cur]) {
        if((visited.get(getCostMapKey(cur, next)) == null || !visited.get(getCostMapKey(cur, next))) && parent[cur] != next) {
          int fuelNeeded = costOfPath.get(getCostMapKey(cur, next));
          if(fuelNeeded <= fuelLeft[cur]) {
            timesRefilled[next] = Math.min(timesRefilled[next], timesRefilled[cur]);
            fuelLeft[next] = fuelLeft[cur] - fuelNeeded;
            parent[next]=cur;
            queue[qSize++]=next;

            visited.put(getCostMapKey(next,cur), true);
            visited.put(getCostMapKey(cur,next), true);
          }
          else if(fuelNeeded <= l) {
            timesRefilled[next]=Math.min(timesRefilled[next], timesRefilled[cur]+1);
            fuelLeft[next] = l - fuelNeeded;
            parent[next]=cur;
            queue[qSize++]=next;

            visited.put(getCostMapKey(next,cur), true);
            visited.put(getCostMapKey(cur,next), true);
          }
        }
      }
    }
  }

  public static int getCostMapKey(int x, int y) {
    return x*1000+y;
  }
 
  public static void main(String[] args) {
      new Thread(null, new Main(), "whatever", 1<<29).start();
  }
 
  public void run() {
    in = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(System.out, false);
 
    try
    {
      // in = new BufferedReader(new FileReader("class_treasurer.txt"));
      // out = new PrintWriter("output.txt");

      int t,x1,cost,q,i,j,s;
      String str;
      String[] token;

      str=in.readLine().trim();
      token=str.split(" ");
      n=Integer.parseInt(token[0]);
      m=Integer.parseInt(token[1]);
      l=Integer.parseInt(token[2]);

      from=new int[m];
      to=new int[m];
      timesRefilled=new int[n];
      fuelLeft=new int[n];
      visited=new HashMap<>();
      parent=new int[n];
      queue=new int[n];
      costOfPath=new HashMap<>();
      totalRefills=new HashMap<>();

      for(i = 0; i < m; i++) {
        str = in.readLine().trim();
        token = str.split(" ");
        int u = Integer.parseInt(token[0]) - 1;
        int v = Integer.parseInt(token[1]) - 1;
        cost = Integer.parseInt(token[2]);
        from[i]=u;
        to[i]=v;
        costOfPath.put(getCostMapKey(u,v), cost);
        costOfPath.put(getCostMapKey(v,u), cost);
      }

      adj=generateAdjList(n, from, to, m);

      for(i=0;i<n;i++) {
        Arrays.fill(parent, 0);
        parent[i]=-1;

        visited.clear();

        fuelLeft[i]=l;

        Arrays.fill(timesRefilled, Integer.MAX_VALUE);
        timesRefilled[i]=0;

        bfs(i);

        for(j=0;j<n;j++) {
          totalRefills.put(getCostMapKey(i,j), timesRefilled[j]);
          totalRefills.put(getCostMapKey(j,i), timesRefilled[j]);
        }
      }

      str=in.readLine().trim();
      token=str.split(" ");
      q=Integer.parseInt(token[0]);

      for(i=0;i<q;i++) {
        str=in.readLine().trim();
        token=str.split(" ");
        s=Integer.parseInt(token[0])-1;
        t=Integer.parseInt(token[1])-1;

        if(totalRefills.get(getCostMapKey(s,t))==Integer.MAX_VALUE) {
          out.println(-1);
        }
        else {
          out.println(totalRefills.get(getCostMapKey(s,t)));
        }
      }

      out.flush();
      out.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
}
