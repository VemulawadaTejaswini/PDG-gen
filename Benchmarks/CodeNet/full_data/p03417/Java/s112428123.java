import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main
{
  private static int         in_M;
  private static int         in_N;
  private static boolean[][] is_front;


  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;
    String         in_str;
    String[]       in_str_split;

    int   cnt_m;
    int   cnt_n;
    long  ans;


    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_N   = Integer.parseInt(in_str_split[0]);
      in_M   = Integer.parseInt(in_str_split[1]);


      /*----------------
       * 計算
       *----------------*/
      /* 初期化 */
      is_front = new boolean[in_N][in_M];
      for(cnt_n=0; cnt_n<in_N; cnt_n++)
      {
        for(cnt_m=0; cnt_m<in_M; cnt_m++)
        {
          is_front[cnt_n][cnt_m] = true;
        }
      }

      /* 計算 */
      for(cnt_n=0; cnt_n<in_N; cnt_n++)
      {
        for(cnt_m=0; cnt_m<in_M; cnt_m++)
        {
          flip( (cnt_n - 1), (cnt_m - 1) );
          flip( (cnt_n - 1), (cnt_m + 0) );
          flip( (cnt_n - 1), (cnt_m + 1) );

          flip( (cnt_n + 0), (cnt_m - 1) );
          flip( (cnt_n + 0), (cnt_m + 0) );
          flip( (cnt_n + 0), (cnt_m + 1) );

          flip( (cnt_n + 1), (cnt_m - 1) );
          flip( (cnt_n + 1), (cnt_m + 0) );
          flip( (cnt_n + 1), (cnt_m + 1) );
        }
      }

      /* カウント */
      ans = 0L;
      for(cnt_n=0; cnt_n<in_N; cnt_n++)
      {
        for(cnt_m=0; cnt_m<in_M; cnt_m++)
        {
          if(!is_front[cnt_n][cnt_m])
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

  private static void flip
  (
    int index_n,
    int index_m
  )
  {
    if( (0 <= index_n) && (index_n < in_N) &&
        (0 <= index_m) && (index_m < in_M)
      )
    {
      is_front[index_n][index_m] = !is_front[index_n][index_m];
    }
  }

}
