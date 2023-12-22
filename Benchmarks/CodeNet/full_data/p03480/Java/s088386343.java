import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

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


    String in_S;
    int    cnt;
    int    num;
    int    continuous_of_zero;
    int    max_continuous_of_zero;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));
      in_str    = new String(in_stream.readLine());

      in_S = in_str;

      num                    = in_S.length();
      continuous_of_zero     = 0;
      max_continuous_of_zero = 0;
      for(cnt=0; cnt<num; cnt++)
      {
        if( 0 == in_S.substring(cnt, cnt+1).compareTo("0") )
        {
          continuous_of_zero++;
        }
        else
        {
          if(max_continuous_of_zero < continuous_of_zero)
          {
            max_continuous_of_zero = continuous_of_zero;
          }
        }
      }
      if(max_continuous_of_zero < continuous_of_zero)
      {
        max_continuous_of_zero = continuous_of_zero;
      }

      UtilLog.ans_ln("" + max_continuous_of_zero);
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
