import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    String s;
    String sl[];
    s = r.readLine();
    sl = s.split(" ");

    int n = Integer.parseInt(sl[0]);
    int m = Integer.parseInt(sl[1]);
    int a = 0;
    int z[] = new int[123456];
    for(int i = 1; i <= n; i++)
    {
      z[i] = m / i;
    }
    for(int i = 1; z[i] >= n; i++)
    {
      if(z[i] * i == m)
      {
        a = i;
      }
    }
    //for(int i = 0; i < 20; i++) System.out.println(z[i]);
    System.out.println(a);
  }

}