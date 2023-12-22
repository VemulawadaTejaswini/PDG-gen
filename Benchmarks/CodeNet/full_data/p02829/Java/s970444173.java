import java.util.Scanner;

public class Main
{
  public static void main(String args[])
  {
    int[] t = {1, 2, 3};
    
    Scanner std = new Scanner(System.in);
    int a = std.nextInt();
    for(int i = 0; i < 3; i++)
    {
      if(t[i] == a)
      {
        t[i] = 0;
      }
    }
    int b = std.nextInt();
    for(int i = 0; i < 3; i++)
    {
      if(t[i] == b)
      {
        t[i] = 0;
      }
    }
    for(int i = 0; i < 3; i++)
    {
      if(t[i] != 0)
      {
        System.out.println(t[i]);
      }
    }
  }
}
    