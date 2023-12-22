import java.util.Scanner;
 
public class Main
{
  public static void main(String args[])
  {
    Scanner std = new Scanner(System.in);
    long t = std.nextLong();
    long a = std.nextLong();
    long k = std.nextLong();
    
    if(t - k <= 0)
    {
      t = 0;
      a -= (t - k);
    }
    
    System.out.println(t + " " + a);
  }
}