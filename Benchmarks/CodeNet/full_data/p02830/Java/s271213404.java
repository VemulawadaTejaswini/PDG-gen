import java.uitl.*:

public class Main
{
  public static void main(String args[])
  {
    Scanner std = new Scanner(System.in);
    int n = std.nextInt();
    String s = std.next();
    String t = std.next();
    String f = null;
    
    for(int i = 0; i < n; i++)
    {
      f = f + s.substring(i, i + 1);
      f = f + t.substring(i, i + 1);
    }
  }
}