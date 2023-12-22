import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    
    String sl[] = r.readLine().split(" ");
    int a = Integer.parseInt(sl[0]);
    int b = Integer.parseInt(sl[1]);
    int c = Integer.parseInt(sl[2]);
    int k = Integer.parseInt(sl[3]);

    System.out.println(k % 2 == 0 ? a - b : b - a);

  }
}
