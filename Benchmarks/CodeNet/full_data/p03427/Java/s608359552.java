import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{

  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;

    String in_num;
    int    ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      in_num = new String(in_stream.readLine());


      ans = 0;

      if(1 == in_num.length())
      {
        ans = Integer.parseInt(in_num);
      }
      else
      {
        ans  = 9 * (in_num.length() - 1);
        ans += ( Integer.parseInt(in_num.substring(0, 1)) - 1);
      }

      System.out.println("" + ans);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
