import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    int    in_A;
    int    in_B;
    String in_S;

    String  regex;
    Pattern pattern;
    Matcher matcher;

    try
    {

      in_stream    = new BufferedReader(new InputStreamReader(System.in));
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      in_A = Integer.parseInt(in_str_split[0]);
      in_B = Integer.parseInt(in_str_split[1]);


      in_str = new String(in_stream.readLine());
      in_S   = in_str;


      regex = "[0-9]{" + in_A + "}-[0-9]{" + in_B + "}";
      pattern = Pattern.compile(regex);
      matcher = pattern.matcher(in_S);

      if(matcher.find())
      {
        UtilLog.ans_ln("Yes");
      }
      else
      {
        UtilLog.ans_ln("No");
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
