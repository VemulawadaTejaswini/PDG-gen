import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{

  public static final long LATER_DATE = 50000000000000000L;

  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;
    String         in_str;

    String in_S;
    long   in_K;


    int    cnt;
    String tmp;
    long   digit;
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
      ans = "1";
      digit = 1;
      for(cnt=0; cnt<in_S.length(); cnt++)
      {
        tmp = in_S.substring(cnt, cnt+1);
        if("1".equals(tmp))
        {
          /* Nothing to do. */
        }
        else
        {
          digit += (new Double(Math.ceil( LATER_DATE * Math.log10(Double.parseDouble(tmp)) ))).longValue();
        }

        if(in_K <= digit)
        {
          ans = tmp;
          break;
        }
      }

      System.out.println(ans);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
