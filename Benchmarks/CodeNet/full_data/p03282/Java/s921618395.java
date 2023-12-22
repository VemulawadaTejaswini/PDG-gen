import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{

  public static final long LATER_DATE = 5000000000000000L;

  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;
    String         in_str;

    String in_S;
    long   in_K;


    String ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_S   = new String(in_stream.readLine());

      in_str = new String(in_stream.readLine());
      in_K   = Long.parseLong(in_str);


      /*----------------
       * 計算
       *----------------*/
      if("1".equals(in_S.substring(0, 1)))
      {
        if(1 == in_K)
        {
          ans = "1";
        }
        else
        {
          ans = in_S.substring(1, 2);
        }
      }
      else
      {
        ans = in_S.substring(0, 1);
      }

      System.out.println(ans);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
