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
    int x = Integer.parseInt(sl[1]);

    int v[] = new int[114514];
    
    s = r.readLine();
    sl = s.split(" ");
    for(int i = 0; i < n; i++)
    {
      v[i] = Math.abs(Integer.parseInt(sl[i]) - x);
    }
    
    for(int i = 0; i < n - 1; i++)
    {
      v[i + 1] = eu(v[i], v[i + 1]);
    }
    
    System.out.println(v[n - 1]);
  }
  
  public static int eu(int a, int b)
  {
    //System.out.println(a);
    //System.out.println(b);
    if(a < b)
    {
      int c = a;
      a = b;
      b = c;
    }
    //System.out.println(a);
    //System.out.println(b);
    while(b != 0)
    {
      a %= b;
      int c = a;
      a = b;
      b = c;
    }
    //System.out.println(a);
    return a;
  }

}