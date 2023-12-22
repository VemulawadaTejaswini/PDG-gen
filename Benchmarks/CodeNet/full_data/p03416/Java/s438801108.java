import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B
{
  
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    String[] sl = s.split("[\\s]+");
    int a = Integer.parseInt(sl[0]);
    int b = Integer.parseInt(sl[1]);
    int z = 0;
    for(Integer i = a; i <= b; i++)
    {
      String ss = i.toString();
      if (ss.charAt(0) == ss.charAt(4) && ss.charAt(1) == ss.charAt(3))
      {
        z++;
      }
    }
    
    System.out.println(z);
  }
  
}