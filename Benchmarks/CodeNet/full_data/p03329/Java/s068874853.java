
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main
{
  
  static int ks[] = {1, 6, 9, 36, 81, 216, 729, 1296, 6561, 7776, 46656, 59049};
  //static int lm[] = {0, 2, 4,  4,  8,   8,   16,  16,   32,   32,    64,    64};
  //static int lm[] = {0, 6, 9,  6,  9,   6,    9,   6,    9,    6,     6,     9};
  static int lm[] = {0, 2, 4,  4,  8,   6,    9,   6,    9,    6,     6,     9};
  static int mem[][] = new int[100001][12];

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    int n = Integer.parseInt(r.readLine());
    
    Arrays.sort(ks);
    int ans = search(n, 11);

    System.out.println(ans);

  }
  
  public static int search(int m, int k)
  {
    if(m <= 5)
    {
      return m;
    }
    if(k < 0)
    {
      return 999999;
    }
    if(mem[m][k] > 0)
    {
      return mem[m][k];
    }
    int z = 999999;
    int v = m;
    for(int i = 0; m >= 0 && i < lm[k]; i++)
    {
      z = Math.min(z, i + search(m, k - 1));
      m -= ks[k];
    }
    mem[v][k] = z;
    return z;
  }

}
