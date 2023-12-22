
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

    int[][] mat = new int[2][n];

    for(int i = 0; i < 2; i++)
    {
      s = r.readLine();
      String[] sl = s.split("[\\s]+");
      for(int j = 0; j < n; j++)
      {
        mat[i][j] = Integer.parseInt(sl[j]);
      }
    }

    for(int j = 1; j < n; j++)
    {
      mat[0][j] += mat[0][j - 1];
    }

    for(int j = n - 2; 0 <= j; j--)
    {
      mat[1][j] += mat[1][j + 1];
    }

    int m = 0;

    for(int j = 0; j < n; j++)
    {
      m = Math.max(mat[0][j] + mat[1][j], m);
    }

    System.out.println(m);

  }
}
