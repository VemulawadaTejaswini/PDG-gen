import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

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
    int m = Integer.parseInt(sl[1]);
    int a = (int)(Math.sqrt((double)m) + (1e-9));
    ArrayList<Integer> v = new ArrayList<>();
    
    
    for(int i = 1; i <= a; i++)
    {
      if(m % i == 0)
      {
        v.add(i);
        v.add(m / i);
      }
    }
    
    Collections.sort(v);
    
    for(int i = 0; i < v.size(); i++)
    {
      if(v.get(i) >= n)
      {
        System.out.println(m / v.get(i));
        System.exit(0);
      }
    }

  }

}