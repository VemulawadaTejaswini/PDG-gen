import java.util.*;

public class Main
{
  static long oo = (long)1e18;
  public static void main(String[] args)
  {
	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int w = in.nextInt();
    long[] W = new long[n];
    int[] V = new int[n];
    for (int i = 0; i < n; i++)
    {
      W[i] = in.nextLong();
      V[i] = in.nextInt();
    }
    
    long[] min = new int[1000*100+1];
    Arrays.fill(min, oo);
    for (int i = 0; i < n; i++)
      for (int v = 1000*100; v >= 0; v--)
        if (v+V[i] <= 1000*100)
          min[v+V[i]] = Math.min(min[v+V[i]], min[v]+W[i]);
    
    int best = 1000*100;
    for ( ; best >= 0; best--)
      if (min[best] <= w)
        break;
    System.out.println(best);        
    in.close();
  }
}