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

    String in_number_str;
    long   in_number;
    int    digit_num;
    int    digit_sum;
    int    cnt;


    try
    {
      in_stream    = new BufferedReader(new InputStreamReader(System.in));
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_number_str = in_str_split[0];
      in_number     = Integer.parseInt(in_number_str);


      digit_num = in_number_str.length();
      digit_sum = 0;
      for(cnt=0; cnt<digit_num; cnt++)
      {
        digit_sum += Integer.parseInt(in_number_str.substring(cnt, cnt+1));
      }

      if(0 == (in_number % digit_sum))
      {
        UtilLog.ans_f("Yes");
      }
      else
      {
        UtilLog.ans_f("No");
      }


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
