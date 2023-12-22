import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {

    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s;
    String[] sl;

    s = r.readLine();
    int n = Integer.parseInt(s);

    int[] prime = {2, 3, 5, 7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
    int[] factor = new int[25];

    for(int i = 1; i <= n; i++)
    {
      int v = i;
      for(int j = 0; j < 25; j++)
      {
        while(v % prime[j] == 0)
        {
          factor[j]++;
          v /= prime[j];
        }
      }
    }

    int f[] = new int[100];
    for(int i = 0; i < 25; i++)
    {
      f[factor[i]]++;
    }

    for(int i = 99; i > 0; i--)
    {
      f[i - 1] += f[i];
    }
    
    
    int a = 0;

    if(f[4] >= 2 && f[2] >= 3)
    {
      a += (f[2] - f[4]) * f[4] * (f[4] - 1) / 2;
    }
    if(f[4] >= 3)
    {
      a += f[4] * (f[4] - 1) * (f[4] - 2) / 2;
    }


    if(f[24] >= 1 && f[2] >= 2)
    {
      a += f[24] * (f[2] - f[24]);
    }
    if(f[24] >= 2)
    {
      a += f[24] * (f[24] - 1);
    }


    if(f[14] >= 1 && f[4] >= 2)
    {
      a += f[14] * (f[4] - f[14]);
    }
    if(f[14] >= 2)
    {
      a += f[14] * (f[14] - 1);
    }

    if(f[74] >= 1)
    {
      a += f[74];
    }

    System.out.println(a);



  }

}
