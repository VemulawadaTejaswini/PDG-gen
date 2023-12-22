import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String sl[];
    
    sl = r.readLine().split(" ");
    int v = Integer.parseInt(sl[0]);
    int d = Integer.parseInt(sl[1]);
    int c = Integer.parseInt(sl[2]);

    for(int i = 0; i < 10; i++)
    {
      c = v * c - d;
      System.out.println(c);
    }
    
    
  }


}
