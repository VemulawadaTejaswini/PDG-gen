
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    String[] sl = s.split("[\\s]+");
    int a = Integer.parseInt(sl[0]);
    int b = Integer.parseInt(sl[1]);

    if(a + b == 15)
    {
      System.out.println("+");
    }
    else if(a * b == 15)
    {
      System.out.println("*");
    }
    else
    {
      System.out.println("x");
    }
  }
}