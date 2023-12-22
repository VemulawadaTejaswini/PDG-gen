import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String[] sl = r.readLine().split("[\\s]+");
    int n = Integer.parseInt(sl[0]);
    int c = Integer.parseInt(sl[1]);
    int d[][] = new int[30][30];
    int count[][] = new int[3][30];

    for(int i = 0; i < c; i++)
    {
      sl = r.readLine().split("[\\s]+");
      for(int j = 0; j < c; j++)
      {
        d[i][j] = Integer.parseInt(sl[j]);
      }
    }

    for(int i = 0; i < n; i++)
    {
      sl = r.readLine().split("[\\s]+");
      for(int j = 0; j < n; j++)
      {
        count[(i + j) % 3][Integer.parseInt(sl[j]) - 1]++;
      }
    }
    
    int sel[] = new int[3];
    int min = Integer.MAX_VALUE;
    
    for(sel[0] = 0; sel[0] < c; sel[0]++)
    {
      for(sel[1] = 0; sel[1] < c; sel[1]++)
      {
        if(sel[0] == sel[1])
        {
          continue;
        }
        for(sel[2] = 0; sel[2] < c; sel[2]++)
        {
          if(sel[1] == sel[2] || sel[0] == sel[2])
          {
            continue;
          }
          
          int stress = 0;
          for(int i = 0; i < 3; i++)
          {
            for(int j = 0; j < c; j++)
            {
              stress += count[i][j] * d[j][sel[i]];
            }
          }
          min = Math.min(min, stress);
        }
      }
    }
    
    System.out.println(min);

  }


}