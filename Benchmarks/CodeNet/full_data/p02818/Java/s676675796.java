import java.util.Scanner;
 
public class Main
{
  public static void main(String args[])
  {
    Scanner std = new Scanner(System.in);
    int t = std.nextInt();
    int a = std.nextInt();
    int k = std.nextInt();
    
    for(int i = 0; i < k; i++)
    {
      if(t >= 1)
      {
        t--;
      }
      else if(a >= 1)
      {
        a--;
      }
      else
      {
        ;
      }
    }
    System.out.println(t + " " + a);
  }
}