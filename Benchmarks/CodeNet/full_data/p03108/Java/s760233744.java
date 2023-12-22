import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] l = new int[m];
    int[] r = new int[m];
    for (int i = m-1; i >= 0; i--)
    {
      l[i] = in.nextInt()-1;
      r[i] = in.nextInt()-1;
    }
    
    int[] size = new int[n];
    Arrays.fill(size, 1);
    long[] ans = new long[m];
    DSU d = new DSU(n);
    for (int i = 0; i < m; i++)
    	if (d.find(l[i]) != d.find(r[i]))
        {
          int a = size[d.find(l[i])];
          int b = size[d.find(r[i])];
          ans[m-1-i] = a*b;
          d.union(l[i], r[i]);
          size[d.find(l[i])] = a+b;
        }
    for (int i = 1; i < m; i++)
    {
      ans[i] += ans[i-1];
      System.out.println(ans[i]);
    }
    
    in.close();
  }
  
  public static class DSU
    {
        int[] set;
        
        DSU(int n)
        {
            Arrays.fill(set = new int[n], -1);
        }
        
        int find(int i)
        {
            return set[i] < 0 ? i : (set[i] = find(set[i]));
        }
        
        boolean union(int a, int b)
        {
            if ((a = find(a)) == (b = find(b))) return false;
            if (set[a] == set[b]) set[a]--;
            if (set[a] <= set[b]) set[b] = a; else set[a] = b;
            s--;
            return true;
        }
    }
}