public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    int n = Integer.parseInt(s);
    s = r.readLine();
    long a[] = new long[200001];
    String[] sl = s.split("[\\s]+");
    for(int i = 0; i < n; i++)
    {
      a[i] = Long.parseLong(sl[i]);
    }

    for(int i = 0; i < n; i++)
    {
      a[i] -= i + 1;
    }

    //System.out.println(Arrays.toString(a));

    long m = 0;
    for(int i = 0; i < n; i++)
    {
      m += a[i];
    }
    m /= n;

    long min = Long.MAX_VALUE;

    for(int j = -7; j <= 7; j++)
    {
      long t = 0;
      for(int i = 0; i < n; i++)
      {
        t += Math.abs(a[i] - m + j);
      }
      min = Math.min(min, t);
    }

    System.out.println(min);
  }

}