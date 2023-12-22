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

    int   in_N;
    int[] in_A;

    int   cnt;
    int   cnt2;
    int[] last_x;
    int[] ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str = new String(in_stream.readLine());
      in_N   = Integer.parseInt(in_str);

      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_A = new int[in_N];
      for(cnt=0; cnt<in_N; cnt++)
      {
        in_A[cnt] = Integer.parseInt(in_str_split[cnt]);
      }

      /*----------------
       * 計算
       *----------------*/
      last_x = new int[in_N];
      ans    = new int[in_N];
      for(cnt=0; cnt<in_N; cnt++)
      {
        last_x[cnt] = 0;
        ans[cnt]    = 0;
      }

      /* 原点から */
      for(cnt=0; cnt<in_N; cnt++)
      {
        for(cnt2=0; cnt2<in_N; cnt2++)
        {
          if(cnt != cnt2)
          {
            ans[cnt2] += Math.abs(last_x[cnt2] - in_A[cnt]);
            last_x[cnt2] = in_A[cnt];
          }
        }
      }

      /* 原点へ */
      for(cnt2=0; cnt2<in_N; cnt2++)
      {
        ans[cnt2] += Math.abs(last_x[cnt2]);
      }

      for(cnt=0; cnt<in_N; cnt++)
      {
        System.out.println(String.valueOf(ans[cnt]));
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
