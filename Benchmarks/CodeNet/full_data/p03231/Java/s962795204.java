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

    int    in_N;
    int    in_M;
    String in_S;
    String in_T;

    int  gcd;
    long lcm;
    int  cnt;
    int  sub;
    int  pos_s;
    int  pos_t;
    long ans;


    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");
      in_N         = Integer.parseInt(in_str_split[0]);
      in_M         = Integer.parseInt(in_str_split[1]);

      in_S = new String(in_stream.readLine());
      in_T = new String(in_stream.readLine());


      /*----------------
       * 計算
       *----------------*/
      ans = 0;
      gcd = calc_gcd(in_N, in_M);
      lcm = in_N * in_M / gcd;

      if( (in_N == gcd) || (in_M == gcd) )
      {
        if( in_N == in_M )
        {
          if( in_S.equals(in_T) )
          {
            ans = in_N;
          }
          else
          {
            ans = -1;
          }
        }
        else if(in_M < in_N)
        {
          ans = in_N;
          sub = in_N / in_M;
          for(cnt=0; cnt<in_M; cnt++)
          {
            pos_s = (sub * cnt);
            pos_t = cnt;
            if( in_S.substring(pos_s, pos_s+1).equals(in_T.substring(pos_t, pos_t+1)) )
            {
              ans = -1;
              break;
            }
          }
        }
        else
        {
          ans = in_M;
          sub = in_M / in_N;
          for(cnt=0; cnt<in_N; cnt++)
          {
            pos_s = cnt;
            pos_t = (sub * cnt);
            if( in_S.substring(pos_s, pos_s+1).equals(in_T.substring(pos_t, pos_t+1)) )
            {
              ans = -1;
              break;
            }
          }
        }
      }
      else
      {
        if( in_S.substring(0, 1).equals(in_T.substring(0, 1)) )
        {
          ans = lcm;
        }
        else
        {
          ans = -1;
        }
      }

//      System.out.println(String.valueOf(gcd));
//      System.out.println(String.valueOf(lcm));
      System.out.println(String.valueOf(ans));
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }



  public static int calc_gcd(int val1, int val2)
  {
    int tmp;


    if(val1 < val2)
    {
      tmp = val1;
      val1 = val2;
      val2 = tmp;
    }

    int r = -1;
    while(r != 0)
    {
      r = val1 % val2;
      val1 = val2;
      val2 = r;
    }

    return val1;
  }
}
