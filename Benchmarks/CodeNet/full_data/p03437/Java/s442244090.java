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

    int in_X;
    int in_Y;

    long cnt;
    long ans;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_X = Integer.parseInt(in_str_split[0]);
      in_Y = Integer.parseInt(in_str_split[1]);


      if(0 == (in_X % in_Y))
      {
        ans = -1;
      }
      else
      {
        ans = -1;
        for(cnt = (in_X*2); cnt<1000000000000000000L; cnt+=in_X)
        {
          if(0 != (cnt % in_Y))
          {
            ans = cnt;
            break;
          }
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
