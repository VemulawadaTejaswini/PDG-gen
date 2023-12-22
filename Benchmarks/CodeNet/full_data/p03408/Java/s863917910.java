import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    HashMap<String, Integer> h = new HashMap<>();

    int n = Integer.parseInt(r.readLine());
    for(int i = 0; i < n; i++)
    {
      String s = r.readLine();
      if(!h.containsKey(s))
      {
        h.put(s, 1);
      }
      else
      {
        h.put(s, 1 + h.get(s));
      }
    }

    n = Integer.parseInt(r.readLine());
    for(int i = 0; i < n; i++)
    {
      String s = r.readLine();
      if(!h.containsKey(s))
      {
        h.put(s, - 1);
      }
      else
      {
        h.put(s, - 1 + h.get(s));
      }
    }

    ArrayList<Integer> v = new ArrayList<>(h.values());

    int z = 0;
    for(int i = 0; i < v.size(); i++)
    {
      if(z < v.get(i))
      {
        z = v.get(i);
      }
    }

    System.out.println(z);

  }

}
