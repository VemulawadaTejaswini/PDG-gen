import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{

  private static int   in_N;
  private static int[] in_C;
  private static int[] in_S;
  private static int[] in_F;

  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;
    String         in_str;
    String[]       in_str_split;

    int cnt;
    int cnt_one;
    int ans;


    try
    {
      in_stream    = new BufferedReader(new InputStreamReader(System.in));
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_N = Integer.parseInt(in_str_split[0]);
      in_N--;

      in_C  = new int[in_N];
      in_S  = new int[in_N];
      in_F  = new int[in_N];
      for(cnt=0; cnt<in_N; cnt++)
      {
        in_str       = new String(in_stream.readLine());
        in_str_split = in_str.split(" ");
        in_C[cnt]    = Integer.parseInt(in_str_split[0]);
        in_S[cnt]    = Integer.parseInt(in_str_split[1]);
        in_F[cnt]    = Integer.parseInt(in_str_split[2]);
      }


      for(cnt=0; cnt<in_N; cnt++)
      {
        ans = 0;
        for(cnt_one=cnt; cnt_one<in_N; cnt_one++)
        {
          ans = calcAapproximation(cnt_one, ans);
        }

        UtilLog.ans_ln("" + ans);
      }

      UtilLog.ans_ln("0");
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }



  private static int calcAapproximation
  (
    int i_index,
    int i_start
  )
  {
    int ret;
    int c;
    int s;
    int f;


    ret = 0;
    c   = in_C[i_index];
    s   = in_S[i_index];
    f   = in_F[i_index];

    if(i_start <= s)
    {
      ret = s + c;
    }
    else
    {
      ret = s + f;
      while(ret<i_start)
      {
        ret += f;
      }
      ret += c;
    }


    return ret;
  }


}


class UtilLog
{
  private static boolean is_debug_mode = false;



  public static void ans_ln
  (
    String i_message
  )
  {
    System.out.println(i_message);
  }



  public static void ans_f
  (
    String i_message
  )
  {
    System.out.printf(i_message);
  }



  public static void inf_ln
  (
    String i_message
  )
  {
    StackTraceElement[] stack;


    if(is_debug_mode)
    {
    stack = new Throwable().getStackTrace();

    System.out.println
      (
        String.format
          (
            "[inf][%s:%s():%5d]",
            stack[1].getClassName(),
            stack[1].getMethodName(),
            stack[1].getLineNumber(),
            i_message
          )
      );
    }
  }
}
