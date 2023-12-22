import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    int n = Integer.parseInt(s);

    long b[] = {0, 0, 0, 0, 0};

    for(int i = 0; i < n; i++)
    {
      s = r.readLine();
      char c = s.charAt(0);
      switch(c)
      {
        case 'M':
          b[0]++;
          break;
        case 'A':
          b[1]++;
          break;
        case 'R':
          b[2]++;
          break;
        case 'C':
          b[3]++;
          break;
        case 'H':
          b[4]++;
          break;
      }
    }

    long a = 0;

    for(int i = 0; i < 3; i++)
      for(int j = i + 1; j < 4; j++)
        for(int k = j + 1; k < 5; k++)
        {
          a += b[i] * b[j] * b[k];
        }

    System.out.println(a);

  }

}
