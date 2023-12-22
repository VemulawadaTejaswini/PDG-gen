import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");

    int n = Integer.parseInt(sl[0]);

    int a[] = new int[101];

    s = r.readLine();
    sl = s.split(" ");
    for(int i = 0; i < n; i++)
    {
    	a[i + 1] = Integer.parseInt(sl[i]);
    }

    int v = 0;
    for(int i = 100; i > 0; i--)
    {
    	boolean b = false;
        for(int j = 0; j <= n; j++)
        {
        	if(i <= a[j] && !b)
        	{
        		v++;
        		b = true;
        	}
        	else if(a[j] < i)
        	{
        		b = false;
        	}
        }
    }

    System.out.println(v);
  }

}