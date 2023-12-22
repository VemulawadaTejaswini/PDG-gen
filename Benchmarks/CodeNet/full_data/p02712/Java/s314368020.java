import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    long result = 0;
    for(int i = 1; i <= x; i++)
    {
      if(i % 3 == 0 && i % 5 == 0)
      {
    	 continue;
      }
      
      if(i % 3 == 0)
      {
    	 continue;
      }
      if(i % 5 == 0)
      {
    	 continue;
      }
      result += i;
    }
    System.out.println(result);
  }
}
