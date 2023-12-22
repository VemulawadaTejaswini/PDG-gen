import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    Integer n = Integer.parseInt(r.readLine());
    int[] c = new int[555];
    int[] s = new int[555];
    int[] f = new int[555];
    int[] a = new int[555];
    int goal = n;


    for(int i = 1; i < n; i++)
    {
      String[] z = r.readLine().split("[\\s]+");
      c[i] = Integer.parseInt(z[0]);
      s[i] = Integer.parseInt(z[1]);
      f[i] = Integer.parseInt(z[2]);
    }


    for(int start = 1; start <= goal; start++)
    {
      a[start] = 0;
      int now = 0;
      //System.out.println("start : " + start);

      for(int pos = start; pos < goal; pos++)
      {
        //System.out.println("pos : " + pos + "     now : " + now);
        if(now < s[pos])
        {
          now = s[pos] + c[pos];
        }
        else if(now % f[pos] == 0)
        {
          now += c[pos];
        }
        else
        {
          now += f[pos] - (now % f[pos]) + c[pos];
        }
      }
      //System.out.println("     now : " + now);

      a[start] = now;
    }

    for(int start = 1; start <= goal; start++)
    {
      System.out.println(a[start]);
    }
  }
}
