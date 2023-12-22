import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    String s = r.readLine();
    String sl[] = s.split(" ");

    int n = Integer.parseInt(sl[0]);
    int t = Integer.parseInt(sl[1]);
    
    int m = 9999;
    
    for(int i = 0; i < n; i++)
    {
      s = r.readLine();
      sl = s.split(" ");

      int c = Integer.parseInt(sl[0]);
      int v = Integer.parseInt(sl[1]);
      
      if(v <= t && c < m)
      {
        m = c;
      }
      
    }
    System.out.println(m < 9999 ? m : "TLE");
  }

}