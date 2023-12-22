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
    int in_A;
    int in_B;

    int    cnt;
    String str;
    int    cnt_str;
    int    sum;
    int    ans;

    try
    {

      in_stream    = new BufferedReader(new InputStreamReader(System.in));
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");


      in_N = Integer.parseInt(in_str_split[0]);
      in_A = Integer.parseInt(in_str_split[1]);
      in_B = Integer.parseInt(in_str_split[2]);

      ans = 0;
      for(cnt=1; cnt<=in_N; cnt++)
      {
        str = "" + cnt;

        sum = 0;
        for(cnt_str=0; cnt_str<str.length(); cnt_str++)
        {
          sum += Integer.parseInt(str.substring(cnt_str, cnt_str+1));
        }

        if((in_A <= sum) && (sum <= in_B))
        {
          ans += cnt;
        }
      }

      UtilLog.ans_ln("" + ans);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
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
