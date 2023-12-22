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

    String   in_number_str;
    int      in_number;
    String   board_str;
    String[] board_split;
    int[]    board;

    int     cnt;
    boolean is_end;
    int     ans;

    try
    {
      in_stream    = new BufferedReader(new InputStreamReader(System.in));
      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");


      in_number_str = in_str_split[0];
      in_number     = Integer.parseInt(in_number_str);

      board_str   = new String(in_stream.readLine());
      board_split = board_str.split(" ");


      board = new int[in_number];
      for(cnt=0; cnt<in_number; cnt++)
      {
        board[cnt] = Integer.parseInt(board_split[cnt]);
      }


      is_end = false;
      ans    = -1;
      while(!is_end)
      {
        ans++;
        for(cnt=0; cnt<in_number; cnt++)
        {
          if(0 == (board[cnt] % 2))
          {
            board[cnt] = board[cnt] / 2;
          }
          else
          {
            is_end = true;
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
