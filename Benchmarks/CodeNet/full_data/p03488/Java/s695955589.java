import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main
{
  private static final int DIR_X_FORWARD  = 0;
  private static final int DIR_X_BACKWARD = 1;
  private static final int DIR_Y_FORWARD  = 2;
  private static final int DIR_Y_BACKWARD = 3;

  private static String[] m_operator;
  private static int      m_operator_num;
  private static int      m_x_goal;
  private static int      m_y_goal;


  public static void main
  (
    String[] args
  )
  {
    BufferedReader in_stream;
    String         in_str;
    String[]       in_str_split;


    int      cnt;
    boolean  result;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));
      in_str    = new String(in_stream.readLine());

      m_operator_num = in_str.length();
      m_operator     = new String[m_operator_num];
      for(cnt=0; cnt<m_operator_num; cnt++)
      {
        m_operator[cnt] = in_str.substring(cnt, cnt+1);
      }


      in_str       = new String(in_stream.readLine());
      in_str_split = in_str.split(" ");

      m_x_goal = Integer.parseInt(in_str_split[0]);
      m_y_goal = Integer.parseInt(in_str_split[1]);


      result = branch(0, 0, 0, DIR_X_FORWARD);


      if(result)
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


  private static boolean branch
  (
    int i_index,
    int i_x_pos,
    int i_y_pos,
    int i_dir
  )
  {
    boolean ret;


    ret = false;
    if((m_x_goal == i_x_pos) && (m_y_goal == i_y_pos) && (m_operator_num <= i_index))
    {
      ret = true;
    }
    else
    {
      if(m_operator_num <= i_index)
      {
        /* Nothing to do. */
      }
      else
      {
        if("F".equals(m_operator[i_index]) )
        {
          switch(i_dir)
          {
            case DIR_X_FORWARD:
              ret = branch((i_index+1), (i_x_pos+1), i_y_pos, i_dir);
              break;

            case DIR_X_BACKWARD:
              ret = branch((i_index+1), (i_x_pos-1), i_y_pos, i_dir);
              break;

            case DIR_Y_FORWARD:
              ret = branch((i_index+1), i_x_pos, (i_y_pos+1), i_dir);
              break;

            case DIR_Y_BACKWARD:
              ret = branch((i_index+1), i_x_pos, (i_y_pos-1), i_dir);
              break;
          }
        }
        else
        {
          switch(i_dir)
          {
            case DIR_X_FORWARD:
            case DIR_X_BACKWARD:
              ret = branch((i_index+1), i_x_pos, i_y_pos, DIR_Y_FORWARD);
              if(!ret)
              {
                ret = branch((i_index+1), i_x_pos, i_y_pos, DIR_Y_BACKWARD);
              }
              break;

            case DIR_Y_FORWARD:
            case DIR_Y_BACKWARD:
              ret = branch((i_index+1), i_x_pos, i_y_pos, DIR_X_FORWARD);
              if(!ret)
              {
                ret = branch((i_index+1), i_x_pos, i_y_pos, DIR_X_BACKWARD);
              }
              break;
          }
        }
      }
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
