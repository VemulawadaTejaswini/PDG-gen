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
    String         in_str;
    String[]       in_str_split;

    long in_N;
    long in_M;

    long ans;


    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_N   = Long.parseLong(in_str_split[0]);
      in_M   = Long.parseLong(in_str_split[1]);


      /*----------------
       * 計算
       *----------------*/
      ans = 0L;

      /* 両方が1なら、1 */
      if( (1 == in_N) && (1 == in_M) )
      {
        ans = 1L;
      }
      /* 片方が2なら、必ず0 */
      else if( (2 == in_N) || (2 == in_M) )
      {
        /* Nothing to do. */
      }
      /* 片方が1なら、大きい方 -2 */
      else if(1 == in_N)
      {
        ans = in_M - 2L;
      }
      /* 片方が1なら、大きい方 -2 */
      else if(1 == in_M)
      {
        ans = in_N - 2L;
      }
      /* 両方3以上 */
      else
      {
        ans = (in_N - 2L) * (in_M - 2L);
      }

      System.out.println("" + ans);

    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }

}
