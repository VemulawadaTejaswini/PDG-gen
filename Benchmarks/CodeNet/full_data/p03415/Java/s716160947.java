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

    String[] in_C;

    int cnt;

    try
    {
      in_stream = new BufferedReader(new InputStreamReader(System.in));

      /*----------------
       * 引数
       *----------------*/
      in_C = new String[9];
      for(cnt=0; cnt<3; cnt++)
      {
        in_str = new String(in_stream.readLine());

        in_C[(cnt*3) + 0] = in_str.substring(0, 1);
        in_C[(cnt*3) + 1] = in_str.substring(1, 2);
        in_C[(cnt*3) + 2] = in_str.substring(2, 3);
      }

      System.out.println(in_C[0] + in_C[4] + in_C[8]);
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
