import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{

  public static void main
  (
    String[] args
  )
  {
    int cnt_n;
    int cnt_k;

    for(cnt_n=1; cnt_n<=15; cnt_n++)
    {
      for(cnt_k=1; cnt_k<=15; cnt_k++)
      {
        test(cnt_n, cnt_k);
      }
    }
  }


  public static void test
  (
    int n,
    int k
  )
  {
    int in_N;
    int in_K;

    int cnt_a;
    int cnt_b;
    int ans;

    try
    {
      in_N = n;
      in_K = k;


      /*----------------
       * 計算
       *----------------*/
      ans = 0;

      if(in_N <= in_K)
      {
        /* Nothing to do. */
      }
      else
      {
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
      }

      System.out.println( String.format("%d, %d, %d", n, k, ans) );
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
