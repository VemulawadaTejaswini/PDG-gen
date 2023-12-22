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

    int in_N;
    int in_K;

    int cnt_a;
    int cnt_b;
    int ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_N   = Integer.parseInt(in_str_split[0]);
      in_K   = Integer.parseInt(in_str_split[1]);


      /*----------------
       * 計算
       *----------------*/

      ans = 0;
      for(cnt_a=1; cnt_a<=in_N; cnt_a++)
      {
        for(cnt_b=1; cnt_b<=in_N; cnt_b++)
        {
          if( in_K <= (cnt_a % cnt_b) )
          {
            ans++;
          }
        }
      }


      System.out.println("" + ans);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
