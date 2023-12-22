import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    int K = Integer.parseInt(r.readLine());

    long[] arr = new long[114514];
    long[] start_low = new long[114514];
    long[] start_high = new long[114514];
    long[] retired_low = new long[114514];
    long[] retired_high = new long[114514];
    long[] cleared_low = new long[114514];
    long[] cleared_high = new long[114514];

    String s = r.readLine();
    String[] sl = s.split("[\\s]+");
    for(int i = 0; i < K; i++)
    {
      arr[i] = Long.parseLong(sl[i]);
    }

    start_low[K] = 2;
    start_high[K] = 3;
    cleared_low[K] = 2;
    cleared_high[K] = 2;
    retired_low[K] = 0;
    retired_high[K] = 1;

    for(int i = K - 1; 0 <= i; i--)
    {
      cleared_low[i] = (start_low[i + 1] + arr[i] - 1) / arr[i] * arr[i];
      cleared_high[i] = start_high[i + 1] / arr[i] * arr[i];
      retired_low[i] = 0;
      retired_high[i] = arr[i] - 1;
      start_low[i] = cleared_low[i] + retired_low[i];
      start_high[i] = cleared_high[i] + retired_high[i];

      if(cleared_low[i] > cleared_high[i] || retired_low[i] > retired_high[i] || start_low[i] > start_high[i]
          || cleared_low[i] < 2 || retired_low[i] < 0 || start_low[i] < 2)
      {
        System.out.println("-1");
        System.exit(0);
      }
    }

    System.out.println(start_low[0] + " " + start_high[0]);


  }

}
