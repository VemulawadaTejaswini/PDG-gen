import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    int n = Integer.parseInt(r.readLine());
    
    String s;
    String sl[];
    
    int x[] = new int[123];
    int y[] = new int[123];
    int h[] = new int[123];
    int k = 0;
    
    for(int i = 0; i < n; i++)
    {
      s = r.readLine();
      sl = s.split(" ");

      x[i] = Integer.parseInt(sl[0]);
      y[i] = Integer.parseInt(sl[1]);
      h[i] = Integer.parseInt(sl[2]);
      
      if(h[i] > 0)
      {
        k = i;
      }
    }
    
    for(int cx = 0; cx <= 100; cx++)
    {
      for(int cy = 0; cy <= 100; cy++)
      {
        int ch = h[k] + Math.abs(cx - x[k]) + Math.abs(cy - y[k]);
        boolean f = true;
        for(int i = 0; i < n; i++)
        {
          int z = ch - Math.abs(cx - x[i]) - Math.abs(cy - y[i]);
          if((z < 0 ? 0 : z) != h[i])
          {
            f = false;
            break;
          }
        }
        if(f)
        {
          System.out.printf("%d %d %d\n", cx, cy, ch);
          System.exit(0);
        }
      }
    }
  }

}