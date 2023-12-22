
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    int k = Integer.parseInt(s);

    int l[] = new int[200];
    int d[] = new int[200];
    int z[] = new int[200];

    l[0] = l[1] = 1;
    d[0] = d[1] = 9;
    z[0] = 9;
    z[1] = 18;
    for(int i = 2; i < 200; i++)
    {
      l[i] = i - 1;
      d[i] = (i - 1) * 10 + 9;
      z[i] = z[i - 1] + d[i] - l[i] + 1;
    }

    int v = 0;
    int a = 0;
    for(int i = 0; i < k; i++)
    {
      if(z[v] <= i)
      {
        v++;
        a = 0;
      }

      System.out.print(l[v] + a);
      for(int j = 0; j < v; j++)
      {
        System.out.print(9);
      }
      System.out.println();
      a++;
    }
  }

}