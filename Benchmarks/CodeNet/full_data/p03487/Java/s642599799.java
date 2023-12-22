import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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

    int   N;
    int[] a;

    int                       cnt;
    int                       ans;
    HashMap<Integer, Integer> kind_num;
    int                       kind_len;
    int                       tmp;

    try
    {
      in_stream    = new BufferedReader(new InputStreamReader(System.in));
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      N = Integer.parseInt(in_str_split[0]);

      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      a        = new int[N];
      kind_len = 0;
      for(cnt=0; cnt<N; cnt++)
      {
        a[cnt] = Integer.parseInt(in_str_split[cnt]);
        kind_len++;
      }

      kind_num = new HashMap<Integer, Integer>();
      for(cnt=0; cnt<N; cnt++)
      {
        kind_num.put(a[cnt], 0);
      }

      for(cnt=0; cnt<N; cnt++)
      {
        kind_num.put(a[cnt], kind_num.get(a[cnt])+1);
      }

      ans = 0;
      for(HashMap.Entry<Integer, Integer> entry : kind_num.entrySet())
      {
        cnt = entry.getKey();
        tmp = entry.getValue();
        if(cnt == tmp)
        {
          /* Nothing to do. */
        }
        else if(cnt < tmp)
        {
          ans += tmp - cnt;
        }
        else
        {
          ans += tmp;
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
