import java.util.*;

public class Main
{
  static int n, w;
  static int[] W, V;
  public static void main(String[] args)
  {
	Scanner in = new Scanner(System.in);
    n = in.nextInt();
    w = in.nextInt();
    W = new int[n];
    V = new int[n];
    for (int i = 0; i < n; i++)
    {
      W[i] = in.nextInt();
      V[i] = in.nextInt()-1;
    }
    
    int[] min = new int[1000];
    Arrays.fill(min, (int)1e10);
    min[0] = 0;
    for (int v = 0; v < 1000; v++)
      for (int i = 0; i < n; i++)
        if (v+V[i] < 1000)
          min[v+V[i]] = Math.min(min[v+V[i]], min[v]+W[i]);
    
    int best = 999;
    for ( ; best >= 0; best--)
      if (min[best] <= w)
        break;
    System.out.println(best);        
    in.close();
  }
}
